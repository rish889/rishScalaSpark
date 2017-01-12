name := "rishScalaSpark"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "1.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "com.databricks" % "spark-csv_2.11" % "1.5.0"
//  "com.typesafe.akka" %% "akka-actor" % "2.5-SNAPSHOT"
)

//resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
