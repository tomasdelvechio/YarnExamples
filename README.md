YarnExamples
============

A repository with Map Reduce examples in Hadoop 2 (YARN API)

Examples at the moment:
 * [WordCount](https://github.com/tomasdelvechio/YarnExamples/tree/master/src/wordCount)
 * [Dean & Ghemawat Inverted Index Build](https://github.com/tomasdelvechio/YarnExamples/tree/master/src/dgIndexer)
 * [Nutch Strategy Inverted Index Build](https://github.com/tomasdelvechio/YarnExamples/tree/master/src/nutchIndexer)

## How to execute the examples?

I assume which you clone this repository, you compiled and build a jar file with netbeans, and you have installed Hadoop 2.X.

If the before it's ok, the DgIndexer should be executed with the next command:

```
hadoop jar /path_to_jar_file/YarnExamples.jar dgIndexer.DgIndexer /user/hduser/data/TrecFile.txt /user/hduser/OutputFolder
```

If the example finish success, you'll can consulting the result:

```
hdfs dfs -cat /user/hduser/OutputFolder/part-r-00000
```

## Tips

### Set arbitrary reducers number: mapreduce.job.reduces

```
hadoop jar /path_to_jar_file/YarnExamples.jar dgIndexer.DgIndexer -Dmapreduce.job.reduces=2 /user/hduser/data/TrecFile.txt /user/hduser/OutputFolder
```
