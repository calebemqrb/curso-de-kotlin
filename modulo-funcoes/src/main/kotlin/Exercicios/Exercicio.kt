package Exercicios

fun main(){
    yearsConverter(10)
    println(characterCounter("String"))
    println(calculateCube(10f))
    println(milesConverter(10f))
    println(stringConveter("STRING DIGITADA"))
}

fun yearsConverter(years: Int){
    val months = years * 12
    val days = years * 365
    val hours = days * 24
    val minutes = hours * 60
    val seconds = minutes * 60

    println("${years} anos equivalem a:\n" +
            "${months} meses\n" +
            "${days} dias\n" +
            "${hours} horas\n" +
            "${minutes} minutos\n" +
            "${seconds} segundos"
    )
}

fun characterCounter(str: String) = str.length

fun calculateCube(nmr: Float) = (nmr * nmr * nmr)


fun milesConverter(miles: Float) = (miles * 1.6f)

fun stringConveter(str: String) = str.lowercase().replace("a", "x")
