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
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 *
 * @author tomas
 */
public class DgMap extends Mapper<LongWritable, Text, Text, IntWritable> {
    IndexTokenizer tokenizer = new IndexTokenizer();
    
    @Override
    public void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        TrecOLParser document = new TrecOLParser(value.toString());
        if (document.isParsed()) {
            this.tokenizer.tokenize(document.getDocContent());
            while (this.tokenizer.hasMoreTokens()) {
                String term = this.tokenizer.nextToken();
                if (term == null) {
                } else {
                    context.write(new Text(term), new IntWritable(Integer.parseInt(document.getDocId())));
                }
            }
        }
    }
}
