package spark

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.commons.io.FileUtils
import org.apache.commons.io.filefilter.WildcardFileFilter
import java.io.File

object SparkTest extends App {

  val sparkConf = new SparkConf().setAppName("simpleReading").
    setMaster("local[2]")
  //set spark configuration

  val sparkContext = new SparkContext(sparkConf)
  // make spark context

  val sqlContext = new SQLContext(sparkContext)
  // make sql context

  val df = sqlContext.read.
    format("com.databricks.spark.csv").
    option("header", "true").
    option("inferSchema", "true").load("inputData/employee.csv")
  //load data from a file

  FileUtils.deleteDirectory(new File("outputData/employee.csv"))

  val selectedCity = df.select("city")
  selectedCity.write.save("outputData/employee.csv")
  //save the data in new csv

  val selectMake = df.select("name", "age") //select particular column
  selectMake.show()
  //show make column

  val tempTable = df.registerTempTable("my_table")
  //makes a temporary table

  val usingSQL = sqlContext
    .sql("select * from my_table")
  //show all the csv file's data in temp table

  usingSQL.show()

}