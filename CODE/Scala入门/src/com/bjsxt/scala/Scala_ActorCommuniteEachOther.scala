package com.bjsxt.scala

import scala.actors.Actor
import scala.io.StdIn

case class Msg(ac: Actor, message: String)

class MyActor1 extends Actor{
  override def act(): Unit = {
    while(true) {
      receive{
        case msg: Msg=>{
          println(msg.message)
          println("Actor1 Enter message: ")
          val message = StdIn.readLine()
          msg.ac ! message
        }
        case _=>{
          println("Fuck off......")
        }
      }
    }
  }
}

class MyActor2(ac: Actor) extends Actor{
  // 向 MyActor1 发送消息
  println("Actor2 Enter message: ")
  private val message = StdIn.readLine()
  val sendMessage = new Msg(this, message)
  ac ! sendMessage

  override def act(): Unit = {
    while(true) {
      receive{
        case s:String=>{
          println(s)
          println("Actor2 Enter message: ")
          val message = StdIn.readLine()
          val sendMessage = new Msg(this, message)
          ac ! sendMessage
        }
        case _=>{
          println("Fuck off...")
        }
      }
    }
  }
}

object Scala_ActorCommuniteEachOther {
  def main(args: Array[String]): Unit = {
    val ac1 = new MyActor1
    val ac2 = new MyActor2(ac1)
    ac1.start()
    ac2.start()
  }
}
