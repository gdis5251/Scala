# Scala 方法与函数

## 方法的定义

```scala
object Scala_Function {
  def main(args: Array[String]): Unit = {
    def max(lhs: Int, rhs: Int): Int = {
      if (lhs >= rhs) {
        // return lhs
        lhs
      } else {
        // return rhs
        rhs
      }
    }

    val result = max(921, 100)
    println(result)
  }
}
```

请注意看 max 方法：

- 定义方式时，方法名前面要加 def 。

- 在写参数时，必须指定类型。Scala 的类型首字母都是大写。

- 如果有返回值可以写上返回值类型，也可以不写，会自动推断。但是建议写上，这样可读性会更好。

- 在返回时，可以不写 return ，Scala 会将最后一行的计算结果作为返回值返回。但还是建议写上，增加可读性。

- 如果方法做的事情逻辑很简单，就像上面的代码那样，可以简写为：

  ```scala
  def max(lhs: Int, rhs: Int): Int = {
    if (lhs >= rhs) return lhs else return rhs
  }
  ```

  甚至是这样：

  ```scala
  def max(lhs: Int, rhs: Int): Int = if (lhs >= rhs) return lhs else return rhs
  ```

- Scala 传递给方法的参数为 val 而不是 var

- 如果去掉方法名和方法体之间的等号，那么这个方法返回类型必定是Unit的。这种说法无论方法体里面什么逻辑都成立，Scala可以把任意类型转换为Unit.假设，里面的逻辑最后返回了一个string，那么这个返回值会被转换成Unit，并且值会被丢弃。

## 递归函数

```scala
  def factorial(num: Int): Int = {
    if (num == 1) {
      return 1
    } else {
      return num * factorial(num - 1)
    }
  }
```

**注意：**递归方法的返回值类型必须显示的写出来。

## 参数有默认值的方法

```scala
  def defaultValue(a: Int, b: Int = 1, c: Int): Unit = {
    println(a + "===" + b + "===" + c)
  }

  // 调用
  defaultValue(2, c=3)
```

Scala 当方法的参数有默认值的时候，这个默认值可以没有顺序的随便指定。这个跟C++不同，C++的函数参数的默认值必须从左往右顺序指定，不可以打乱这个顺序，也不可以跳过某个参数。

但是 Scala 在调用的时候，如果不指定参数的名称赋值，则会从左往右顺序赋值，如果需要跳过有默认值的参数，只需要指定给后面的参数赋值即可。

## 可变长参数方法

```scala
  def mutliParams(str: String*): Unit = {
    for (s <- str) {
      println(s)
    }
  }
```

这个就是可以传任意个参数，让方法去处理。这里去遍历 str 的时候我们用到了处理循环一段集合的方法。也有简化版本：

```scala
  def mutliParams(str: String*): Unit = {
//    for (s <- str) {
//      println(s)
//    }
    str.foreach(value => {
      println(value)
    })
  }
```

可以使用 str 这个集合内部的 foreach 方法。而且这个方法内部甚至可以更简化：

```scala
  def mutliParams(str: String*): Unit = {
//    for (s <- str) {
//      println(s)
//    }
//    str.foreach(value => {
//      println(value)
//    })
    str.foreach(println(_))
  }
```

直接给 println 里面加个下划线。甚至可以直接：

```scala
  def mutliParams(str: String*): Unit = {
//    for (s <- str) {
//      println(s)
//    }
//    str.foreach(value => {
//      println(value)
//    })
//    str.foreach(println(_))
    str.foreach(println)
  }
```

只写个 println 。

但是我感觉还是用第一种或者第二种写起来复杂的，因为那样可读性比较好。

## 匿名函数

```scala
    //有参数匿名函数
    val value1 = (a : Int) => {
      println(a)
    }
    value1(1)
    //无参数匿名函数
    val value2 = ()=>{
      println("我爱尚学堂")
    }
    value2()
    //有返回值的匿名函数
    val value3 = (a:Int,b:Int) =>{
      a+b
    }
    println(value3(4,4)) 
```

**注意：**

- 可以将匿名函数返回给 val 定义的值
- 匿名函数不能显式声明函数的返回类型

## 嵌套函数

```scala
    /**
     * 嵌套方法
     * 例如：嵌套方法求5的阶乘
     */
    def fun5(num:Int)={
      def fun6(a:Int,b:Int):Int={
        if(a == 1){
          b
        }else{
          fun6(a-1,a*b)
        }
      }
      fun6(num,1)
    }
    println(fun5(5))
```

这个没啥说的，就是在一个函数里，实现另一个函数并调用。

## 偏应用函数

```scala
    /**
     * 偏应用函数
     */
    def log(date :Date, s :String)= {
      println("date is "+ date +",log is "+ s)
    }
    
    val date = new Date()
    log(date ,"log1")
    log(date ,"log2")
    log(date ,"log3")
    
    //想要调用log，以上变化的是第二个参数，可以用偏应用函数处理
    val logWithDate = log(date,_:String)
    logWithDate("log11")
    logWithDate("log22")
    logWithDate("log33")
```

这个就是说，一个函数每次调用的时候，有很多参数时不变的，只有少数或者一个是变化的，就可以定义把一个函数定义成偏应用函数，每次调用的时候，只传那个变化的参数就行。

## 高阶函数

```scala
    /**
     * 高阶函数
     * 函数的参数是函数		或者函数的返回是函数		或者函数的参数和返回都是函数
     */
    
    //函数的参数是函数
    def hightFun(f : (Int,Int) =>Int, a:Int ) : Int = {
      f(a,100)
    }
    def f(v1 :Int,v2: Int):Int  = {
      v1+v2
    }
    
    println(hightFun(f, 1))
    
    //函数的返回是函数
    //1，2,3,4相加
    def hightFun2(a : Int,b:Int) : (Int,Int)=>Int = {
      def f2 (v1: Int,v2:Int) :Int = {
        v1+v2+a+b
      }
      f2
    }
    println(hightFun2(1,2)(3,4))
    
    //函数的参数是函数，函数的返回是函数
    def hightFun3(f : (Int ,Int) => Int) : (Int,Int) => Int = {
      f
    } 
    println(hightFun3(f)(100,200))
    println(hightFun3((a,b) =>{a+b})(200,200))
    //以上这句话还可以写成这样
    //如果函数的参数在方法体中只使用了一次 那么可以写成_表示
    println(hightFun3(_+_)(200,200))
```

**注意：**

- 当函数的返回值是函数时，必须要显式的指定返回的函数类型。
- 或者返回这个函数时，在这个函数名后加 空格_ 的方式

## 柯里化函数

```scala
   /**
     * 柯里化函数
     */
    def fun7(a :Int,b:Int)(c:Int,d:Int) = {
      a+b+c+d
    }
    println(fun7(1,2)(3,4))
```

这个就是高阶函数第二种，返回一个函数类型的简化写法。

叮~:bell: