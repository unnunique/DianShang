package com.sydney.dream.dianshang.create_data

import org.apache.spark.sql.SparkSession

/**
  * 创建一些测试数据
  */
class InitSomeData {
    def main(args: Array[String]): Unit = {
        val spark = SparkSession
            .builder
            .appName("InitSomeData")
            .master("local[*]")
            .getOrCreate()
        val sc = spark.sparkContext
        val sqlC = spark.sqlContext

    }
}
