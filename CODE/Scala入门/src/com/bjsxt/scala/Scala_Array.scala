package com.bjsxt.scala

import scala.collection.mutable.ArrayBuffer

object Scala_Array {
  def main(args: Array[String]): Unit = {
    // 使用 new 创建数组时，后面的 () 里的内容是指定数组的长度
    val arr1 = new Array[Int](3)
    // 赋值使用 () 代替其他语言的 []
    arr1(0) = 1
    arr1(1) = 2
    arr1(2) = 3
    // 打印
//    arr1.foreach(println)

    // 如果不使用 new 创建，就需要直接赋值
    val arr2 = Array[Int](1, 2, 3, 1, 1, 1, 1, 1, 1)
//    arr2.foreach(println)

    // 二维数组
    val arr3 = new Array[Array[Int]](3)
    arr3(0) = Array[Int](1, 2, 3)
    arr3(1) = Array[Int](4, 5, 6)
    arr3(2) = Array[Int](7, 8, 9)
    // 打印
//    arr3.foreach(arr=>{arr.foreach(println)})

    // 可变长数组
    val arr4 = ArrayBuffer[Int](3)
    arr4.append(2)
    arr4.+=(1)
    arr4.foreach(println)

  }
}
