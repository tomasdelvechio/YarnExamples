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
package nutchIndexer;

import indexingCommons.TrecOLParser;
import indexingCommons.IndexTokenizer;
import indexingCommons.CastingTypes;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Mapper class for the Nutch approach
 * @author tomas
 */
public class NutchMap extends Mapper<LongWritable, Text, IntWritable, MapWritable> {
    IndexTokenizer tokenizer;
    MapWritable documentAnalyzed;
    CastingTypes ct;
    IntWritable cero;

    public NutchMap() throws IOException {
        this.ct = new CastingTypes();
        this.cero = ct.cero;
        this.tokenizer = new IndexTokenizer();
    }
    
    @Override
    public void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        TrecOLParser document = new TrecOLParser(value.toString());
        documentAnalyzed = new MapWritable();
        if (document.isParsed()) {
            this.tokenizer.tokenize(document.getDocContent());
            while (this.tokenizer.hasMoreTokens()) {
                IntWritable counter = cero;
                String newTerm = this.tokenizer.nextToken();
                Text term = new Text(newTerm);
                if (documentAnalyzed.containsKey(term)) {
                    counter = this.ct.strToIntWr(documentAnalyzed.get(term).toString());
                }
                documentAnalyzed.put(term, ct.intToIntWr(counter.get()+1));
            }
            if ( ! documentAnalyzed.isEmpty()) {
                context.write(this.ct.strToIntWr(document.getDocId()), documentAnalyzed);
            }
        }
    }
}

