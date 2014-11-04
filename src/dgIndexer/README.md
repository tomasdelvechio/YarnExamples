# Dean & Ghemawat Indexer Implementation

This is my interpretation of D&G[1] MapReduce Indexing, based on pseudo-code presented in MRorNot[2] paper.

The implementation is based on Hadoop 2.5.0. The Code is tested and run.

The Posting list generated contain term, doc id and term frequency and the format is:

```
house\t{docId1=Freq1, docId2=Freq2, docId3=Freq3, docId4=Freq4}
```

The file is sorted by word and docId. In the future, will be implemented an order by Freq (i.e. support early termination techniques for retrieval)

The index output is too much excessive in the control characters. Futures commits will be fix this.

ToDo List:

 * Test the code with a large collection ([issue #9](https://github.com/tomasdelvechio/YarnExamples/issues/9))
 * Minimize the representation of posting list ([issue #10](https://github.com/tomasdelvechio/YarnExamples/issues/10))
  * Delete unnecessary characters
  * Apply DocId Compresion or gap
 * Stemming (integrate [Snowball](http://snowball.tartarus.org/)) ([issue #11](https://github.com/tomasdelvechio/YarnExamples/issues/11))
 * Delete Stopwords ([issue #12](https://github.com/tomasdelvechio/YarnExamples/issues/12))
 * Represent DocIds by Side effects file[2] in map method.
 * The DocId Sort it does in reduce method. Will be implemented a technique which allow does the sort using the Sort phase of MapReduce.

# References 

[1]: Dean, J., & Ghemawat, S. (2004). MapReduce: Simplified Data Processing on Large Clusters. To Appear in OSDI, 1–13. Retrieved from <http://books.xunsu.co/mapreduce-osdi04.pdf>

[2]: Mccreadie, R. M. C., Macdonald, C., & Ounis, I. (2009). Comparing Distributed Indexing: To MapReduce or Not? 7 Th Workshop on Large-Scale Distributed Systems for Information Retrieval, i(July), 41–48. Retrieved from <http://ceur-ws.org/Vol-480/LSDSIR09.pdf#page=41>
