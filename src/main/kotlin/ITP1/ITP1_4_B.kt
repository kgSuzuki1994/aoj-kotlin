package ITP1

fun main(args: Array<String>) {
    val (a) = readLine()!!.split(" ").map(String::toDouble)

    println("%6f %6f".format(a * a * Math.PI, a * 2 * Math.PI))
}
