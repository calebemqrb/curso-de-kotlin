fun main(){
    var i = 0
    do {
        println(i)
        i++
    }while (i < 10)

    do {
        print("Qual o seu nome?\n")
        val value = readLine()
    }while (value == "")
}