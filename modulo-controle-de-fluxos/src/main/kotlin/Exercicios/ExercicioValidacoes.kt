package Exercicios

fun calculateBonuses(jobTitle: String, yearsOfExperience: Float): String {
    if (jobTitle.lowercase() == "gerente") {
        if (yearsOfExperience < 2f) {
            return "R$2.000,00"
        }
        return "R$3.000,00"
    } else if (jobTitle.lowercase() == "coordenador") {
        if (yearsOfExperience < 1f) {
            return "R$1.500,00"
        }
        return "R$1.800,00"
    } else if (jobTitle.lowercase() == "engenheiro de software") {
        return "R$1.000,00"
    } else if (jobTitle.lowercase() == "estagiario"){
        return "R$500,00"
    }
    return "R$0,00"
}


fun main() {
    val bonuses = calculateBonuses("dsadsadsa", 2f)
    if( bonuses == "R$0,00"){
        println("Cargo incorreto!")
    }
    println(calculateBonuses("Gerente", 2f))
    println(calculateBonuses("Gerente", 1f))
    println(calculateBonuses("Coordenador", 1f))
    println(calculateBonuses("Coordenador", 0.5f))
    println(calculateBonuses("Estagiário", 2f))
}