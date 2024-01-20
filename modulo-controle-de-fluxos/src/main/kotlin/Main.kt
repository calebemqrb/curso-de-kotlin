fun validateAge(age: Int){
    if (age > 18){
        println("Maior de idade")
        if (age > 60){
            println("Terceira idade")
        }
    }else if (age <= 10){
        println("Criança")
    }else{
        println("Menor de idade")
    }
}

fun greeting(day: Boolean) = if(day){
    "Good morning!"
    }else{
        "Good nigth!"
    }

fun main() {
    validateAge(30)
    validateAge(17)
    validateAge(10)
    validateAge(65)
    println(greeting(true))
}