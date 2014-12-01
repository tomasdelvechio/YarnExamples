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
final public class CastingTypes {
    static public final IntWritable zero = new IntWritable(0);
    static public final IntWritable one = new IntWritable(1);
    
    private CastingTypes() {
    }
    
    static public IntWritable intToIntWr(int number) {
        return new IntWritable(number);
    }
    
    static public IntWritable strToIntWr(String strNumber) {
        return new IntWritable(Integer.parseInt(strNumber));
    }
    
    static public Text strToText(String str) {
        return new Text(str);
    }
    
    static public int strToInt(String strNumber) {
        return Integer.parseInt(strNumber);
    }
    
    static public Text intToText(Integer number) {
        return new Text(number.toString());
    }
}
