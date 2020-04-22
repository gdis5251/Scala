package com.bjsxt.scala

object Scala_If_Else {
  def main(args: Array[String]): Unit = {

    /**
     * Scala 里的 for 循环用 ex <- 1 to x     : 意思是 ex 从 1 到 x
     *                     ex <- 1 until x  : 意思是 ex 从 1 到 x - 1
     */
    for (age <- 18 to 88) {
      // if else 跟其他语言没啥区别
      // 在打印时，在双引号外加 s , 可以在双引号内通过 $ 符号直接引用变量
      if (age < 20) {
        println(s"$age 岁很年轻，富有创造力！好好学习，好好运动！")
      } else if (age >= 20 && age < 30) {
        println(s"$age 岁这个年龄段，希望你努力工作！尽快成为技术大牛！为以后的创业打下基础！你一定会成功！不要放弃！")
      } else if (age >= 30 && age < 50) {
        println(s"$age 岁你一定在创业上取得了很大的成就吧！加油！希望你赚很多的钱！有一个很幸福的家庭！")
      } else {
        println(s"$age 岁你的钱以后够这辈子随便花了！你肯定会带着家人去全世界旅行！实现最初的梦想！")
      }
    }
  }
}
