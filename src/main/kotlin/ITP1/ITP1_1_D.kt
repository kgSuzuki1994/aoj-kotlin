package ITP1

fun main(args: Array<String>) {
    var h = readLine()!!.toInt()

    val s: Int = h % 60
    h /= 60

    val m: Int = h % 60
    h /= 60

    println("${h}:${m}:${s}")
}
