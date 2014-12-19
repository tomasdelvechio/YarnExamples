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

import indexingCommons.PostingList;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * Reducer class for the D&G approach
 * @author tomas
 */
public class DgCombCombiner extends Reducer<Text, IntWritable, Text, PostingList> {
        
    @Override
    public void reduce(Text term, Iterable<IntWritable> docIds, Context context)
      throws IOException, InterruptedException {
        PostingList postingList = new PostingList();
        for (IntWritable docId : docIds) {
            postingList.addPosting(docId.get());
        }
        //String posting = postingList.toStringDE();
        context.write(new Text(term), postingList);
    }
}
