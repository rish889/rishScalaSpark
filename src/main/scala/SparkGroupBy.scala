import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by rishabhg on 12/30/16.
  */
object SparkGroupBy {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkGroupBy").setMaster("local[*]")
    val sc = new SparkContext(conf)


    //    val x = sc.parallelize(Array("Joseph", "Jimmy", "Tina", "Thomas", "James", "Cory", "Christine", "Jackeline", "Juan"), 3)
    //    val y = x.groupBy(word => word.charAt(0))
    //    y.collect
    //    println("=================================="+y.first()+"==================================")


    //    val sales=sc.parallelize(List(
    //      ("West",  "Apple",  2.0, 10),
    //      ("West",  "Apple",  3.0, 15),
    //      ("West",  "Orange", 5.0, 15),
    //      ("South", "Orange", 3.0, 9),
    //      ("South", "Orange", 6.0, 18),
    //      ("East",  "Milk",   5.0, 5)))
    //    println("==================================\n"+    sales.map{ case (store, prod, amt, units) => ((store, prod), (amt, amt, amt, units)) }.
    //      reduceByKey((x, y) =>
    //        (x._1 + y._1, math.min(x._2, y._2), math.max(x._3, y._3), x._4 + y._4)).collect.mkString("\n")+"\n==================================")


    val lines = sc.textFile("/Volumes/dev/workspace/hadoopProjectName/rishHive/scripts/DSearchImpressions/input.txt")
    val csv=lines.map(_.split("\t"))
    val x = csv.groupBy(_(1))
    println("=================================="+x.collect.mkString("\n")+"==================================")



  }
}
