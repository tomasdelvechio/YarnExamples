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

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.apache.hadoop.io.IntWritable;

/**
 * This class allow build a generic posting list structure, without reference to
 * any term. Can generate string to the structure and optionally apply delta-gap
 * encoding to the output.
 * @author tomas
 */
public class PostingList {
    Map<Integer,Integer> postingList;

    public PostingList() {
        this.postingList = new TreeMap<Integer,Integer>();
    }
    
    /**
     * Add a posting to the list, assume frequency 1.
     * @param docId Document Id to add in the posting.
     */
    public void addPosting(Integer docId) {
        this.addPosting(docId, CastingTypes.one);
    }
    
    /**
     * Generic method to add a document to the posting list, with arbitrary 
     * frequency.
     * @param documentId Document identifier
     * @param freq Number of occurrences of term in Document
     */
    public void addPosting(Integer documentId, IntWritable freq) {
        int oldFreq;
        oldFreq = 0;
        if (this.postingList.containsKey(documentId)) {
            oldFreq = this.postingList.get(documentId);
        }
        this.postingList.put(documentId, oldFreq+freq.get());
    }
    
    /**
     * Convert to string a posting list structure for dump in Inverted Index.
     * @return posting String Return the string representation of the posting.
     */
    @Override
    public String toString() {
        String posting = "";
        for (Map.Entry<Integer, Integer> entry : this.postingList.entrySet()) {
            posting += entry.getKey() + ":" + entry.getValue() + ";";
        }
        
        /* delete the last semicolon of string */
        if (posting.length() > 0 && posting.charAt(posting.length()-1)==';') {
            posting = posting.substring(0, posting.length()-1);
        }
        
        return posting;
    }
    
    /**
     * Method for print the posting list with delta encoding gaps for DocId
     * @return posting String Return the posting with Delta-Encoding
     */
    public String toStringDE() {
        String posting = "";
        Integer docIdAnt = -1;
        
        for (Map.Entry<Integer, Integer> postingEntry : this.postingList.entrySet()) {
            if (docIdAnt == -1) {
                docIdAnt = postingEntry.getKey();
                posting += docIdAnt + ":" + postingEntry.getValue() + ";";
            } else {
                posting += postingEntry.getKey() - docIdAnt + ":" + postingEntry.getValue() + ";";
                docIdAnt = postingEntry.getKey();
            }
        }
        
        /* delete the last semicolon of string */
        if (posting.length() > 0 && posting.charAt(posting.length()-1)==';') {
            posting = posting.substring(0, posting.length()-1);
        }
        
        return posting;
    }
    
    public Set<Entry<Integer, Integer>> getEntrySet() {
        return this.postingList.entrySet();
    }
}
