package ITP1

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)

    val out: String =
            if (a > b)      "a > b"
            else if (a < b) "a < b"
            else            "a == b"

    println(out)
}
