package com.bjsxt.scala

/**
 * 1. Scala 中的 object 相当于单例模式，object 中定义的都是静态的, Obj 不可以传参
 *    如果要传参，要定义 apply 方法
 * 2. Scala 中定义变量使用 var , 定义常量使用 val . 变量可变，常量不可变
 * 3. Scala 中有分号推断机制，每行后面不需要加分号
 * 4. 变量和常量后的类型可以省略不写，会自动推断
 * 5. Scala 中命名建议使用驼峰命名法
 * 6. Scala 类中可以传参，传参一定要指定类型，有了参数就有了默认构造
 * 7. Scala 类中重写构造时，构造的第一行必须调用默认的构造. def this(...) {...}
 * 8. Scala 中当 new class 时，除了方法不执行（构造方法除外），其他都执行
 * 9. Scala 当类的名称和对象的名称相同时，类称为对象的伴生类，对象称为类的伴生对象，他们之间可以访问其私有变量
 *   （私有变量在 val/var 之前加 private）
 */

class Person(xName: String, xAge: Int) {
  val name = xName
  var age = xAge
  var gender = 'F'

  println("header")

  def this(yName: String, yAge: Int, yGender: Char) {
    this(yName, yAge)
    this.gender = yGender
  }

  def sayName(): Unit = {
    println(name + Scala_ClassAndObj.name)
  }

  println("footer")
}

object Scala_ClassAndObj {
  val name = "你一定可以很快变成技术大牛，然后30岁以后选择创业，最后大获成功！！！"

  println("In Obj")

  def apply(i: Int): Unit = {
    println("obj 传参" + i)
  }

  def main(args: Array[String]): Unit = {
//    println("Hello Scala!")
//
//    // val 声明的是常量，不可以重新赋值
//    val a = 1
//    println(a)
//
//
//    // var 声明的是变量，可以重新赋值
//    var b = 2
//    b = 3
//    println(b)

//    val person = new Person("Gerald", 22)
//    println(person.name)
//    println(person.age)
//    person.age = 16
//    println(person.age)
//
//    person.sayName()

//    val p2 = new Person("Seligman", 17, 'M')
//    println(p2.gender)

    Scala_ClassAndObj(1000)
  }
}
