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

import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;

/**
 * This class receive a string of chars and apply the tokenize policy
 * 
 * @author tomas
 */
public class IndexTokenizer {
    
    // token delimitator
    String delims = " .,?!_()[]{}";
    
    // Longitud minima de termino
    int minLongTerm = 3;
    private StringTokenizer tokenizer;
    private final Text term = new Text();
    
    /**
     * This method split the line, low case the term and generate the Iterator.
     * <p>
     * The method tokenize the line in base to pre defined criteria. The method
     * assume which the line not contain any \n or \r character.
     * @param line String   The line to be tokenized
     */
    public void tokenize(String line) {
        line = line.toLowerCase();
        this.tokenizer = new StringTokenizer(line, delims);
    }
    
    /**
     * This method return the next token, skipping others not valid tokens.
     * @return  term Text The next valid token
     */
    public String nextToken() {
        String token = null;
        while (this.hasMoreTokens()) {
            String candidateToken = this.builToken(this.tokenizer.nextToken());
            if (this.isValidToken(candidateToken)) {
                token = candidateToken;
                break;
            }
        }
        
        return token;
    }
    
    public boolean hasMoreTokens() {
        return this.tokenizer.hasMoreTokens();
    }
    
    public boolean isValidToken(String token) {
        // [ToDo] Check if word is Stopword
        return minLongTerm <= token.length();
    }
    
    public String builToken(String candidateToken) {
        // [ToDo] Stemming (?)
        return candidateToken;
    }
}
