/*
 * Copyright (C) 2014 tomas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dgCombIndexer;

import indexingCommons.CastingTypes;
import indexingCommons.TrecOLParser;
import indexingCommons.IndexTokenizer;
import indexingCommons.InvertedIndex;
import indexingCommons.PostingList;
import java.io.IOException;
import java.util.Map;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Mapper class for the D&G approach
 * @author tomas
 */
public class DgCombMap extends Mapper<LongWritable, Text, Text, Text> {
    IndexTokenizer tokenizer;
    private InvertedIndex localIndex;

    public DgCombMap() throws IOException {
        this.tokenizer = new IndexTokenizer();
    }
    
    @Override
    public void setup(Mapper.Context context) {
        this.localIndex = new InvertedIndex();
    }
    
    @Override
    public void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        TrecOLParser document = new TrecOLParser(value.toString());
        if (document.isParsed()) {
            this.tokenizer.tokenize(document.getDocContent());
            while (this.tokenizer.hasMoreTokens()) {
                String term = this.tokenizer.nextToken();
                if (term != null) {
                    //context.write(new Text(term), new IntWritable(Integer.parseInt(document.getDocId())));
                    this.localIndex.addPosting(new Text(term), CastingTypes.strToInt(document.getDocId()), CastingTypes.one);
                }
            }
        }
    }
    
    @Override
    public void cleanup(Mapper.Context context) throws IOException, InterruptedException {
        for (Text term : this.localIndex.getVocabulary()) {
            PostingList posting = this.localIndex.getPosting(term);
            for (Map.Entry<Integer, Integer> entry : posting.getEntrySet()) {
                String docId = entry.getKey().toString();
                String freq = entry.getValue().toString();
                Text localPosting = new Text(docId + ":" + freq);
                context.write(term, localPosting);
            }
            
        }
    }
}
