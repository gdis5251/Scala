package com.bjsxt.scala

class Animal(name: String) {
  def canFly(): Unit = {
    println(s"$name can fly...")
  }
}

class Dog(name: String) {
  val xname = name
}

object Scala_ImplicitFunc2 {
  implicit def DogToAnimal(d: Dog): Animal = {
    return new Animal(d.xname)
  }
  def main(args: Array[String]): Unit = {
    val dog = new Dog("hu yue")
    dog.canFly()
  }
}
