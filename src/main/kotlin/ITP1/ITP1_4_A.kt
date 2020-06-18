package ITP1

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)


    println("%d %d %5f".format(a/b, a%b, a.toDouble()/b.toDouble()))
}
