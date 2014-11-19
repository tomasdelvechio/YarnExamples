# Nutch Indexer Implementation

This is my interpretation of Nutch[1] MapReduce Indexing, based on description presented in MRorNot[2] paper.

The implementation is based on Hadoop 2.5.0.

The Posting list generated contain term, doc id and term frequency and the format is:

```
term\docId1:Freq1;docId2:Freq2;docId3:Freq3;docId4:Freq4...
```

The file is sorted by word and docId. In the future, will be implemented an order by Freq (i.e. support early termination techniques for retrieval)

# References 

[1]: [Nutch Project - MapReduce](http://wiki.apache.org/nutch/MapReduce)

[2]: Mccreadie, R. M. C., Macdonald, C., & Ounis, I. (2009). Comparing Distributed Indexing: To MapReduce or Not? 7 Th Workshop on Large-Scale Distributed Systems for Information Retrieval, i(July), 41–48. Retrieved from <http://ceur-ws.org/Vol-480/LSDSIR09.pdf#page=41>
