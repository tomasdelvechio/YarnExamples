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

import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * This class receive a string of chars and apply the tokenize policy
 * <p>
 * The class is instantiated and could be used many times for tokenize several lines.
 * @author tomas
 */
public class IndexTokenizer {
    String delims;
    int minLongTerm;
    private StringTokenizer tokenizer;
    StopWords stopWord;
    Stemmer stemmer;
    private static final Pattern REGEX_PATTERN = Pattern.compile("[^\\p{Alnum}]+");
    private String candidateToken;

    public IndexTokenizer() throws IOException {
        this.minLongTerm = 3;
        this.stopWord = new StopWords();
        this.stemmer = new Stemmer();
    }
    
    /**
     * This method split the line, low case the term and generate the Iterator.
     * <p>
     * The method tokenize the line in base to pre defined criteria. The method
     * assume which the line not contain any \n or \r character.
     * @param line String   The line to be tokenized
     */
    public void tokenize(String line) {
        line = line.toLowerCase();
        line = REGEX_PATTERN.matcher(line).replaceAll(" ");
        this.tokenizer = new StringTokenizer(line);
    }
    
    /**
     * This method return the next token.
     * @return  term Text The next valid token
     */
    public String nextToken() {
        return this.candidateToken;
    }
    
    /**
     * Method for consult if more tokens are present, skipping others not valid tokens.
     * @return boolean return True if some token is present, False in other case
     */
    public boolean hasMoreTokens() {
        if (this.tokenizer.hasMoreTokens()) {
            String newToken;
            newToken = this.builToken(this.tokenizer.nextToken());
            while (this.tokenizer.hasMoreTokens() && !this.isValidToken(newToken)) {
                newToken = this.builToken(this.tokenizer.nextToken());
            }
            if (this.isValidToken(newToken)) {
                this.candidateToken = newToken;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Check if token is valid for this tokenizer
     * @param token String The token to be evaluated
     * @return boolean The evaluation of several criteria
     */
    public boolean isValidToken(String token) {
        boolean isStopWord = this.stopWord.isStopWord(token);
        boolean isValidLong = minLongTerm <= token.length();
        boolean isNull = (null == token); // This is right for compare with null?
        return (!isStopWord && isValidLong && !isNull);
    }
    
    public String builToken(String candidateToken) {
        candidateToken = stemmer.stemmToken(candidateToken.trim());
        return candidateToken;
    }
}
