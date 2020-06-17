package ITP1

fun main(args: Array<String>) {
    var num = readLine()!!.toInt()

    var i = 1

    while (num != 0) {
        println("Case $i: $num")
        num = readLine()!!.toInt()
        i++
    }
}
