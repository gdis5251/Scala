package com.bjsxt.scala

object Scala_Set {
  def main(args: Array[String]): Unit = {
    // Set 会自动去重
    val set1 = Set[Int](1, 2, 3, 4, 5, 5)
    //    set1.foreach(println)
    val set2 = Set[Int](3, 4, 5, 6)
    // 交集
    val set3 = set1.intersect(set2)
    //    set3.foreach(println)

    // 差集
    val set4 = set1.diff(set2) // 只显示 .前面 set 里相对于 () 里没有的
    set4.foreach(println)      // 1, 2

    // 可变长的数据结构都在 import scala.collection.mutable 里面
  }
}
