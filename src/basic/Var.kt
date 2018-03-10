package basic

import java.lang.Integer.parseInt

val PI = 3.1415926 //top-level variable
var x = 0

fun increase() {
    x += 1
    println("x= $x")
}

fun replace() {
    var a = 1
    val s1 = "a is $a"//val 常量需要在初始化时赋值
    a = 2;
    val s2 = "${s1.replace("is", "was")},but now is $a" //$标示是一个表达式的，需要特殊处理的
    println("$s1,$s2");
}

fun main(args: Array<String>) {
    valvar()
    varTry()
    increase()
    replace()

    printProduct("3","4")
    println(getStringLength("zhaochuan"))
    printLoop()
    printIndex()
}

private fun varTry() {
    var x = 5 //mutable variable
    x++
    println("x=" + x)
}

private fun valvar() {
    val a: Int = 1 // immediate assignment
    val b = 2; // `Int` type is inferred
    val c: Int // Type required when no initializer is provided
    c = 3// deferred assignment
    println("a = $a,b= $b,c= $c")
}

//using condition expression
private fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//use if as an expression
private fun maxNewOf(a:Int,b:Int) = if(a>b) a else b

//private fun parseInt(str : String):Int?{
//    return null
//}

fun printProduct(arg1:String,arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    println(x*y)
}

/**
 * The is operator checks if an expression is an instance of a type.
 * If an immutable local variable or property is checked for a specific type,
 * there's no need to cast it explicitly:
 */
fun getStringLength(obj:Any):Int?{
    if(obj is String){
        return obj.length
    }
    return null;
}

fun printLoop(){
    val items = listOf("apple","banana","oriage")
    for(item in items){
        println(item)
    }
}

fun printIndex(){
    val items = listOf("ios","android","web","service","database","AI","AR")
    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }
}

