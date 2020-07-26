package com.bjsxt.scala

class ThreadExample extends Thread {
  override def run(): Unit = {
    println("Thread is running huhu~")
    Thread.currentThread().getName()
  }

  def task(): Unit = {
    for (i <- 0 to 5) {
      println(i)
      Thread.sleep(200)
    }
  }
}

class ThreadExample2 extends Runnable {
  override def run(): Unit = {
    println("Thread is running runnable")
  }
}


object thread {
  def main(args: Array[String]): Unit = {
    val thread = new ThreadExample
    thread.start()
    thread.task()
    //    val t = new Thread(thread)
    //    t.start()
    //    t.setName("awesome man")
    //    println(t.getName)

  }
}
