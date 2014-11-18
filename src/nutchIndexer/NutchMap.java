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
    CastingTypes ct = new CastingTypes();
    IntWritable cero = ct.intToIntWr(0);
    IntWritable uno = ct.intToIntWr(1);

    public NutchMap() throws IOException {
        this.tokenizer = new IndexTokenizer();
        this.documentAnalyzed = new MapWritable();
    }
    
    @Override
    public void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        TrecOLParser document = new TrecOLParser(value.toString());
        if (document.isParsed()) {
            this.tokenizer.tokenize(document.getDocContent());
            while (this.tokenizer.hasMoreTokens()) {
                IntWritable counter = cero;
                String newTerm = this.tokenizer.nextToken();
                if( ! (newTerm == null) ) {
                    Text term = new Text(newTerm);
                    if (this.documentAnalyzed.containsKey(term)) {
                        counter = (IntWritable)this.documentAnalyzed.get(term);
                    }
                    this.documentAnalyzed.put(term, ct.intToIntWr(counter.get()+1));
                } else {
                    System.out.println("Doc Id");
                    System.out.println(document.getDocId());
                    System.out.println("Termino");
                    System.out.println(newTerm);
                }
                /*Text term = null;
                try {
                    term = new Text(this.tokenizer.nextToken());
                } catch (NullPointerException e) {
                    System.out.println("Exception");
                    System.out.println(document.getDocId());
                }*/
                
                
            }
            if ( ! this.documentAnalyzed.isEmpty()) {
                context.write(new IntWritable(Integer.parseInt(document.getDocId())), this.documentAnalyzed);
            }
        }
    }
}
