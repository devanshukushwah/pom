package org.example

import org.apache.spark.SparkConf
//import java.lang
import org.apache.spark.SparkContext
//import org.apache.spark.sql.SparkSession
//import org.apache.spark.sql.
import org.apache.spark

/**
 * @author ${user.name}
 */
object App {
  
//  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
//
  def main(args : Array[String]) {
  val path = "G:\\maven\\ScalaSpark\\src\\main\\scala\\org\\example\\text.txt";
  val str : String = "hello";
  println("Hello World! " + path + " " + str);

//  val spark = SparkSession.builder()
//    .master("local[1]")
//    .appName("SparkByExamples.com")
//    .getOrCreate();
//  println(spark)
//  println("Spark Version : " + spark.version)

    val sparkConf = new SparkConf().setAppName("Context_Name").setMaster("local");
//    val appName = sparkConf.setAppName("Context_Name");
    val sparkContext = new SparkContext(sparkConf);



  val rdd = sparkContext.textFile("G:\\maven\\ScalaSpark\\src\\main\\scala\\org\\example\\text.txt");

  println("Total number of lines : " + rdd.count());

  rdd.foreach(line => {
    println("Read line by line : " + line);
  })
}
}
