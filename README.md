# Image-clan

The project aims at using the hadoop ecosystem to analyze image files and Implement search/filter on the same using map reduce programs and get the images names which are same.
The image file unlike raw data files cannot be read directly into the system. The cluster is used to work upon the data extracted from the image files and extract substantial information to search from the data inside the image file. So whole process include data import from servers to hdfs using flume then converting the image files into binary sequence files using core MapReduce jobs and finally running search/filter mapreduce to search same images files. The underlying map-reduce algorithms are coded in java.
