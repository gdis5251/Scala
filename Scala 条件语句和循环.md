# Scala 条件语句和循环

> 该篇博客仅适用于已经有至少一门的语言基础的同学

## If Else

Scala 的条件判断语句跟其他语言没什么不同，就是判断的时候需要加上括号。Golang 在判断的时候就不需要加括号。

```scala
			if (age < 20) {
        println(s"$age ")
      } else if (age >= 20 && age < 30) {
        println(s"$age ")
      } else if (age >= 30 && age < 50) {
        println(s"$age ")
      } else {
        println(s"$age ")
```

**这里有一个小知识点**：当我们在打印时，在双引号外面加上 $ 符号，就可以直接引用变量。

这一点很方便啊，就不需要我们在双引号外面去用 + 号拼凑了。

## For、While、Do-While

Scala 的循环很有意思。我先来说一下循环里面一般都需要遍历一个区间内的内容。如果需要遍历 1-10 的数字。

Golang 的实现是这样的：

```go
for i := 1; i <= 10; i++ {
  // something
}
```

Scala 的实现：

```scala
for (i <- 1 to 10) {
  // someting
}
// 或者
for (i <- 1 until 11) {
  // something
}
```

Scala 里有两个操作符 to/until

- to 的作用是一段闭区间的所有数的集合
- until 则是左闭右开区间

如果你需要遍历一段指定的区间，你可以直接

```scala
// 直接把指定的区间赋值给 i 就行
for (i <- j) {
  // someting
}
```

**剩下的 for、while、do-while 和 C++、Java 没有什么区别，这里就不赘述。**

叮~:bell:

