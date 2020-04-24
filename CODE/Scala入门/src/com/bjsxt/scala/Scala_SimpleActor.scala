package com.bjsxt.scala

import scala.actors.Actor

/**
 * 实现一个 MyActor 要继承 Actor
 * 重写 act 函数
 */
class MyActor extends Actor{
  override def act(): Unit = {
    receive{
      case s:String=>{
        println(s"$s is a String type")
      }
      case _=>{
        println("No match...")
      }
    }
  }
}

object Scala_SimpleActor {
  def main(args: Array[String]): Unit = {
    /**
     * 使用的时候先创建出来一个变量
     * 再调用 strat 方法来启动 Actor
     * 给 Actor 发消息是用 ! 来实现的
     */
    val myActor = new MyActor
    myActor.start()

    myActor ! "hello Gerald"
  }
}
