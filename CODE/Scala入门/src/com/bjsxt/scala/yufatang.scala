package com.bjsxt.scala

class Future {
  def apply(what: String) {
    println(s"I will be $what man")
  }
}

object yufatang {
  def main(args: Array[String]): Unit = {
    //    val me = new Future
    //    me("awesome")

//    val a = 60
//    printf("%s\n", ~a)

//    val fruit = List("apple", "orange", "banana")
//    val head = fruit.head
//    val tail = fruit.tail
//    fruit+"a"
//    fruit.foreach(println)

    var m = Map("a" -> 1)
    m += ("b" -> 2)

    m.foreach(println)

  }
}
