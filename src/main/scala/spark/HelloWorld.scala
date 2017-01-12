package spark

import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("HelloWorld").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val lines = sc.textFile("/Volumes/dev/workspace/hadoopProjectName/rishHive/scripts/DSearchImpressions/input.txt")
    println("=================================="+lines.count()+"==================================")
    println("=================================="+lines.first()+"==================================")
  }
}




//System.setProperty("hadoop.home.dir", "D:\\hadoop\\hadoop-common-2.2.0-bin-master\\")
//val conf = new SparkConf().setAppName("SparkWordCount").setMaster("local[*]")
//val sc = new SparkContext(conf)
//val tf = sc.textFile("D:\\Spark\\spark-1.6.0\\README.md")
////val tf = sc.textFile(args(0))
//val splits = tf.flatMap(line => line.split(" ")).map(word =>(word,1))
//val counts = splits.reduceByKey((x,y)=>x+y)
//splits.saveAsTextFile("D:\\Spark\\spark-1.6.0\\SplitOutput")
//counts.saveAsTextFile("D:\\Spark\\spark-1.6.0\\CountOutput")