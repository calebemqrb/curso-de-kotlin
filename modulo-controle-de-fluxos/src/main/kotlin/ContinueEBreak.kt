fun main() {

    var i = 0
    while (i < 80) {
        if (i < 50) {
            i ++
            continue
        }
        println(i)
        i++
    }

    var j = 0
    while (j < 80) {
        if (j == 50) {
            break
        }
        println(j)
        j++
    }
}