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

import java.util.HashMap;
import java.util.Map;
import org.apache.hadoop.io.Text;

/**
 *
 * @author tomas
 */
public class InvertedIndex {
    Map<Text,PostingList> index;

    public InvertedIndex() {
        this.index = new HashMap<Text,PostingList>();
    }
    
    public void addEntry(Text term, PostingList newPartialPosting) {
        if (this.index.containsKey(term)) {
            PostingList oldPartialPosting = this.index.get(term);
            oldPartialPosting.mergePosting(newPartialPosting);
        }
    }
    
}
