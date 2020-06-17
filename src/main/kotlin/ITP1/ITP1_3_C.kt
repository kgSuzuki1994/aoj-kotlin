package ITP1

fun main(args: Array<String>) {
    while (true) {
        val num = readLine()!!.split(" ").map(String::toInt).sorted()
        if (num.sum() != 0) println(num.joinToString(" "))
        else break
    }
}
