fun main() {

    val str = "Programação Kotlin!"

    println("Tamanho da string: ${str.length}")
    println("Primeira posição da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 5))
    println(str.replace("Programação", "Curso de Programação"))
    println(str.uppercase())
    println(str.lowercase())
    println("     exemplo de .trim ".trim())
}