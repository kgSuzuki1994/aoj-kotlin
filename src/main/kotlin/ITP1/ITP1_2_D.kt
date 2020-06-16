package ITP1

fun main(args: Array<String>) {
    val (W, H, x, y, r) = readLine()!!.split(" ").map(String::toInt)

    if ((x - r) < 0 || (x + r) > W) {
        println("No")
    } else if ((y - r) < 0 || (y + r) > H) {
        println("No")
    } else {
        println("Yes")
    }
}
