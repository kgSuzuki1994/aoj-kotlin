package ITP1

fun main(args: Array<String>) {
    readLine()!!.toInt()
    val input = readLine()!!.split(" ").map(String::toLong)

    println("%d %d %d" .format(input.min(), input.max(), input.sum()))
}
