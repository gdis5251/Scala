package com.bjsxt.scala

object Scala_ImplicitFunc {
  def sayName(implicit name: String): Unit = {
    println(s"$name is a handsome guy!")
  }

  def main(args: Array[String]): Unit = {
    /**
     * 函数参数隐式类型
     * 当函数的参数使用 Implicit 定义为隐式类型时
     * 调用函数就不是要传参，他会自动在当前作用域去找同类型的隐式类型变量
     * 使用找到的变量来填充参数。
     * 所以同一个作用域内，不允许定义两个和两个以上的同类型隐式类型变量
     */
    implicit val name = "Gerald"
    sayName
  }
}
