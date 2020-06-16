package ITP1

fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map(String::toInt)

    println(if (b in (a + 1) until c) "Yes" else "No")
}
