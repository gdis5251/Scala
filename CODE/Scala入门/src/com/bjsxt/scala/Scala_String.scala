package com.bjsxt.scala

object Scala_String {
  def main(args: Array[String]): Unit = {
    val a = "asb"
    println(a.equals("ASB"))
    println(a.equalsIgnoreCase("ASB"))

    val s = new StringBuilder
    s.append("asda", "sadasd")
    s.+=('a') // += 只能加一个字符
    s.++=("asdadasda") // ++= 可以加一个字符串
    s.+('e')
    println(s)
  }
}
