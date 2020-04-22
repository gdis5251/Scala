package com.bjsxt.scala

object Scala_Function {
  def main(args: Array[String]): Unit = {
    //    def max(lhs: Int, rhs: Int): Int = {
    //      if (lhs >= rhs) {
    //         lhs
    //      } else {
    //         rhs
    //      }
    //    }
//    def max(lhs: Int, rhs: Int): Int = {
//      if (lhs >= rhs) return lhs else return rhs
//    }
    /**
     * 普通方法
     * @param lhs
     * @param rhs
     * @return
     */
    def max(lhs: Int, rhs: Int): Int = if (lhs >= rhs) return lhs else return rhs

//    val result = max(921, 100)
//    println(result)

    // 5 的阶乘
    println(factorial(5))

    // 参数默认值
    defaultValue(2, c=3)

    // 可变长参数方法
    mutliParams("郭文峰", "你", "一定", "可以", "成功")
    mutliParams()
  }

  /**
   * 递归方法
   * @param num
   * @return
   */
  def factorial(num: Int): Int = {
    if (num == 1) {
      return 1
    } else {
      return num * factorial(num - 1)
    }
  }

  /**
   * 参数有默认值的方法
   * @param a
   * @param b
   * @param c
   */
  def defaultValue(a: Int, b: Int = 1, c: Int): Unit = {
    println(a + "===" + b + "===" + c)
  }

  def mutliParams(str: String*): Unit = {
//    for (s <- str) {
//      println(s)
//    }
//    str.foreach(value => {
//      println(value)
//    })
    str.foreach(println(_))
    //str.foreach(println)
  }
}
