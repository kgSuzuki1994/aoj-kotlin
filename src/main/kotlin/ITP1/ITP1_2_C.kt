package ITP1

fun main(args: Array<String>) {
    val arr = readLine()!!.split(" ").map(String::toInt).sorted()
    println(arr.joinToString(" "))
}
