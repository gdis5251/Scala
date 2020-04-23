package com.bjsxt.scala

object Scala_Map {
  def main(args: Array[String]): Unit = {
    // 创建
    val map1 = Map[Int, String]((1, "Gerald"), (2, "Seligman"), (3, "GuoWenfeng"))
    // 获取 map 的值
    val value = map1.get(1).get // 这样获取如果 key 不存在会报错
    val value2 = map1.get(11).getOrElse("no value") // 这样如果 key 不存在就会返回括号里的字符串
//    println(value)
//    println(value2)

    // 遍历 map
    map1.foreach(key=>{
      println(s"key = ${key._1}, value = ${key._2}")
    })

    // map 的值
    val values = map1.values
    values.foreach(value=>{
      println(s"value=>$value")
    })
  }
}
