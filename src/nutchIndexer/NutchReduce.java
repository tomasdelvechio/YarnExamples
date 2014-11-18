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

import indexingCommons.CastingTypes;
import indexingCommons.InvertedIndex;
import indexingCommons.PostingList;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * Reducer class for the Nutch approach
 * @author tomas
 */
public class NutchReduce extends Reducer<IntWritable, MapWritable, Text, Text> {
    InvertedIndex invertedIndex;
    CastingTypes ct = new CastingTypes();

    public NutchReduce() {
        this.invertedIndex = new InvertedIndex();
    }
    
    public void reduce(IntWritable docId, MapWritable documentAnalyzed, Context context)
      throws IOException, InterruptedException {
        for (MapWritable.Entry<Writable, Writable> termEntry : documentAnalyzed.entrySet()) {
            //Text term = (Text) termEntry.getKey();
            Text term = new Text(termEntry.getKey().toString());
            //IntWritable freq = (IntWritable) termEntry.getValue();
            IntWritable freq = ct.strToIntWr(termEntry.getValue().toString());
            Integer documentId = docId.get();
            this.invertedIndex.addPosting(term, documentId, freq);
        }
    }
    
    @Override
    public void cleanup(Context context) throws IOException, InterruptedException {
        for (Text term : this.invertedIndex.getVocabulary()) {
            context.write(term, ct.strToText(this.invertedIndex.getPosting(term).toStringDE()));
        }
    }
}
