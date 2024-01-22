package Exercicios

fun validatetriangle(l1: Int, l2: Int, l3: Int): String {
    return if(l1 == l2 && l1 == l3 && l2 == l3){
        "É um triângulo equilátero!"
    }else{
        "Não é triãngulo equilátero!"
    }
}

fun main(){
    println("Insira o valor do primeiro lado:")
    val l1 = readLine()

    println("Insira o valor do segundo lado:")
    val l2 = readLine()

    println("Insira o valor do terceiro lado:")
    val l3 = readLine()

    if(l1 != null && l1 != "" &&
        l2 != null && l2 != "" &&
        l3 != null && l3 != ""){
        println(validatetriangle(l1.toInt(), l2.toInt(), l3.toInt()))
    }
}