package ITP1

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)

    val area = a * b
    val perimeter = 2 * (a + b)

    println("$area $perimeter")
}
