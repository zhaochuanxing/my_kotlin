package basic
//http://kotlinlang.org/docs/reference/basic-syntax.html

//Function with an expression body and inferred return type:
fun sum(a:Int,b:Int)=a+b

//Function returning no meaningful value:
fun printSum(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}
fun main(args:Array<String>){
    println("sum 19 and 23 is ${sum(19,23)}")
    printSum(-2,16)
}