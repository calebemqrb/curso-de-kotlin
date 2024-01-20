fun main() {
    helloWorld()
    println(sum(
        10,
        10
    ))
}

fun helloWorld() {
    println("Hello, World!")
}

fun sum(a: Int, b: Int): Int{
    return (a + b)
}