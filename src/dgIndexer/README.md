# Dean & Ghemawat Indexer Implementation

This is my interpretation of D&G[^Dean2004] MapReduce Indexing, based on pseudo-code presented in MRorNot[^Mccreadie2009] paper.

The implementation is based on Hadoop 2.5.0. The Code is tested and run.

The Posting list generated at the moment is defficient, the format is:

```
word\tdocId1,docId4,docId1,docId3...
```

The file is sorted by word, but the postings are not order by document Id yet. This is a feature to be added in the future.

# References 

[^Dean2004]: Dean, J., & Ghemawat, S. (2004). MapReduce: Simplified Data Processing on Large Clusters. To Appear in OSDI, 1–13. Retrieved from <http://books.xunsu.co/mapreduce-osdi04.pdf>
[^Mccreadie2009]: Mccreadie, R. M. C., Macdonald, C., & Ounis, I. (2009). Comparing Distributed Indexing: To MapReduce or Not? 7 Th Workshop on Large-Scale Distributed Systems for Information Retrieval, i(July), 41–48. Retrieved from <http://ceur-ws.org/Vol-480/LSDSIR09.pdf#page=41>