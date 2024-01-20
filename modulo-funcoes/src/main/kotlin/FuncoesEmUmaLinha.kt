fun main(){
    helloWorld2()
    println(sum2(10, 10))
    println(divisao(10f, 5f))
}

fun helloWorld2() = println("Hello, World!")

fun sum2(a: Int, b: Int) = (a + b)

fun divisao(a: Float, b: Float): Float = (a/b)