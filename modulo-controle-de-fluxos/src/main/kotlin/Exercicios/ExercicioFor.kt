package Exercicios

fun exercicio1(){
    for(i in 1..50){
        print(" $i ")
    }
}

fun exercicio2(){
    for(i in 50 downTo 0){
        print(" $i" )
    }
}

fun exercicio3(){
    for (i in 1..50){
        if(i % 5 == 0){
            continue
        }
        println(i)
    }
}

fun exercicio4(){
    var sum = 0
    for (i in 1 .. 500){
        sum += i
    }
    println(sum)
}

fun exercicio5(nmr: Int){

    for (i in 1..nmr){
        for (j in 1..i){
            print("#")
        }
        println()
    }
}

fun main(){
    exercicio1()
    exercicio2()
    exercicio3()
    exercicio4()
    exercicio5(5)
}