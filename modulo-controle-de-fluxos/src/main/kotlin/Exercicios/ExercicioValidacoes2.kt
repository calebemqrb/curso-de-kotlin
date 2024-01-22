package Exercicios

fun validateParameters(age: Int, typeInvitation: String, codeInvitation: String): String{

    if (age < 18){
        return "Acesso negado! Menores de idade não são permitidos"
    }else if(typeInvitation.lowercase() != "comum" && typeInvitation.lowercase() != "premium" && typeInvitation.lowercase() != "luxo"){
        return "Acesso negado! Convite inválido."
    }

    return if((typeInvitation.lowercase() == "premium" || typeInvitation.lowercase() == "luxo") && codeInvitation.lowercase().startsWith("xl")){
        "Welcome :)"
    }else{
        return if (typeInvitation.lowercase() == "comum" && codeInvitation.lowercase().startsWith("xt")) {
            "Welcome :)"
        } else {
            "Acesso negado! Convite inválido."
        }
    }

}

fun main(){
    println("Insira sua idade:")
    val age = readLine()

    println("Insira o tipo do seu convite:")
    val typeInvitation = readLine()

    println("Insira o código do convite:")
    val codeInvitation = readLine()

    if (age != null && age != "" &&
        typeInvitation != null && typeInvitation != "" &&
        codeInvitation != null && codeInvitation != ""){

        println(validateParameters(age.toInt(), typeInvitation, codeInvitation))
    }else{
        println("Erro! Existem campos não preenchidos!")
    }
}