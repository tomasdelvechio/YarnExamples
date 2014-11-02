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
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 *
 * @author tomas
 */
public class DgMap extends Mapper<LongWritable, Text, Text, IntWritable> {
    //private final static IntWritable one = new IntWritable(1);
    private final Text term = new Text();

    @Override
    public void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        
        // Tags importantes
        String startDocTag = "<DOC>";
        String endDocTag = "</DOC>";
        String startDocIdTag = "<DOCNO>";
        String endDocIdTag = "</DOCNO>";
        
        // Delimitadores de tokenizacion
        String delims = " .,?!_()[]{}";
        
        int minLongTerm = 3; // Longitud minima de termino
        int minLongDoc = 27; // Longitud minima de un doc
        
        // Documento
        String line = value.toString();
        
        if (line.length() >= minLongDoc) {
            
            // Obtener DocId
            int startDocIdIdx = line.indexOf(startDocIdTag) + startDocIdTag.length();
            int endDocIdIdx = line.indexOf(endDocIdTag);

            String docId = line.substring(startDocIdIdx, endDocIdIdx);

            // Recuperar contenido del Documento
            int startDocContentIdx = line.indexOf(endDocIdTag) + endDocIdTag.length();
            int endDocContentIdx = line.indexOf(endDocTag);

            String docContent = line.substring(startDocContentIdx, endDocContentIdx);
            
            // Tokenizer
            docContent = docContent.toLowerCase();
            StringTokenizer tokenizer = new StringTokenizer(docContent, delims);
            while (tokenizer.hasMoreTokens()) {
                term.set(tokenizer.nextToken());
                // [ToDo] Stemming (?)
                // [ToDo] Check if word is Stopword
                // Solo indexa termino de longitud especificada en minLongTer
                if (minLongTerm <= term.toString().length()) {
                    context.write(new Text(term), new IntWritable(Integer.parseInt(docId)));
                }
            }

        }
        
    }
}
