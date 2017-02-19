package learningSparkOrielly

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by rishabhg on 2/18/17.
  */
object Examples {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("Examples").setMaster("local[*]")
    val sc = new SparkContext(conf)

    //    val lines = sc.textFile("./inputData/README.md")
    //    println(lines.count())
    //    println(lines.first())
    //    println(lines.foreach(println))
    //    println(lines.take(10).foreach(println))
    //    println(lines.filter(line => line.contains("Python")))
    //    println(lines.filter(line => line.contains("Python")).first())
    //    println(lines.filter(line => line.contains("Python")).foreach(println))


    //    val list = sc.parallelize(List("pandas", "i like pandas"))
    //    println(list.count())
    //    println(list.first())


    //    val input = sc.parallelize(List(1, 2, 3, 4))
    //    println(input.map(x => x * x).collect().mkString(","))
    //    println(input.reduce((x, y) => x + y))


    //Calculate Average
    //    val input = sc.parallelize(List(1, 2, 3, 4))
    //    val result = input.aggregate((0, 0))(
    //      (acc, value) => (acc._1 + value, acc._2 + 1),
    //      (acc1, acc2) => (acc1._1 + acc2._1, acc1._2 + acc2._2))
    //    val avg = result._1 / result._2.toDouble
    //    println(avg)


    //    val lines = sc.parallelize(List("hello world", "hi"))
    //    val words = lines.flatMap(line => line.split(" "))
    //    println(words.first())
  }
}
