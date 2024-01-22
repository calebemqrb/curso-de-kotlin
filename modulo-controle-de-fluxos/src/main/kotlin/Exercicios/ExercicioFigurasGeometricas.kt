package Exercicios

fun validateFigure(l1: Int, l2: Int): String {
    return if(l1 == l2){
        "É um quadrado!"
    }else{
        "Não é um quadrado!"
    }
}

fun main(){
    println("Insira o valor do primeiro lado:")
    val l1 = readLine()

    println("Insira o valor do segundo lado:")
    val l2 = readLine()

    if(l1 != null && l1 != "" &&
        l2 != null && l2 != ""){
        println(validateFigure(l1.toInt(), l2.toInt()))
    }
}
