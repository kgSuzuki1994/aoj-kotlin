package ITP1

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
    var cnt = 0

    for (i in a..b) {
        if (c % i == 0) cnt++
    }
    println(cnt)
}
