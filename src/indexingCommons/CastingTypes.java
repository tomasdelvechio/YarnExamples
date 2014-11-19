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
package indexingCommons;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

/**
 *
 * @author tomas
 */
public class CastingTypes {
    public final IntWritable cero;
    
    public CastingTypes() {
        this.cero = new IntWritable(0);
    }
    
    public IntWritable intToIntWr(int number) {
        return new IntWritable(number);
    }
    
    public IntWritable strToIntWr(String strNumber) {
        return new IntWritable(Integer.parseInt(strNumber));
    }
    
    public Text strToText(String str) {
        return new Text(str);
    }
}
