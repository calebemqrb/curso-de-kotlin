fun bonusWhen(jobTitle: String): String{

    return when(jobTitle.lowercase()){
        "gerente" -> "R$2.000,00"
        "coordenador" -> "R$1.500,00"
        "engenheiro de software" -> "R$1.000,00"
        "estagiário" -> "R$500,00"
        else -> "R$0,00"
    }
}

fun main(){
    println(bonusWhen("Gerente"))

    val bool = false
    when(bool){
        true -> println(bool)
        false -> println(bool)
    }
}