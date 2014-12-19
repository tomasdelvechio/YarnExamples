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

import indexingCommons.Indexer;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.util.ToolRunner;

/**
 * DgCombIndexer implements a Indexer build tool with the Dean and Ghemawat and
 * adding the Combiner Option
 * 
 * @version 1
 * @since 1
 * @author tomas
 */
public class DgCombIndexer extends Indexer {
    
    /**
     * The main method for execute the Index Builder.
     * @param args String[] The parameters passed to application
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int res;
        res = ToolRunner.run(new Configuration(), new DgCombIndexer(), args);
        System.exit(res);
    }
    
    @Override
    public int run(String[] args) throws Exception {
 
        super.run(args);
        
        job.setJarByClass(DgCombIndexer.class);
 
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        
        job.setMapperClass(DgCombMap.class);
        job.setReducerClass(DgCombReduce.class);

        return job.waitForCompletion(true) ? 0 : 1;
    }
    
}
