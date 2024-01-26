package Exercicios

fun exercicioWhile1() {

    var preenchimentoPorBalao = 0
    var qtdBaloes = 0
    while (preenchimentoPorBalao <= 2000) {
        preenchimentoPorBalao += 7
        qtdBaloes++
    }
    println("Quantidade de balões: $qtdBaloes")
}

fun exercicioWhile2() {
    var count = 1
    while (count <= 50) {
        if (count % 3 == 0) {
            println("Buzz")
        } else if (count % 5 == 0) {
            println("Fizz")
        } else if (count % 3 == 0 && count % 5 == 0) {
            println("FizzBuzz")
        } else {
            println(count)
        }
        count++
    }
}

fun exercicioWhile3(str: String) {
    var length = str.length - 1
    while (length >= 0) {
        println(str[length])
        length--
    }
}

fun exercicioWhile4(str: String): Boolean {
    val strLower = str.lowercase()
    var bool = false
    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countX == countO
}

fun main() {
    exercicioWhile1()
    exercicioWhile2()
    exercicioWhile3("String")
    println(exercicioWhile4("oxox"))
}