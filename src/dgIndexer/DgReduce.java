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
package dgIndexer;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 *
 * @author tomas
 */
public class DgReduce extends Reducer<Text, IntWritable, Text, Text> {
        
    @Override
    public void reduce(Text term, Iterable<IntWritable> docIds, Context context)
      throws IOException, InterruptedException {
        String posting = "";
        for (IntWritable docId : docIds) {
            if (posting.isEmpty()) {
                posting = docId.toString();
            } else {
                posting = posting + "," + docId.toString();
            }
        }
        
        context.write(new Text(term), new Text(posting));
    }
}