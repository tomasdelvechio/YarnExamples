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

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author tomas
 */
public class PostingList {
    Map<Integer,Integer> postingList = new TreeMap<Integer,Integer>();
    
    public void addPosting(Integer docId) {
        int counter = 0;
        if (this.postingList.containsKey(docId)) {
            counter = this.postingList.get(docId);
        }
        this.postingList.put(docId, counter+1);
    }
    
    @Override
    public String toString() {
        String posting = this.postingList.toString();
        posting = posting.replace("{", "").replace("}", "");
        posting = posting.replace(" ", "");
        return posting;
    }
    
}
