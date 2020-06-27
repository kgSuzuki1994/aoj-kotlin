package ITP1

fun main(args: Array<String>) {
    while (true) {
        val (H, W) = readLine()!!.split(" ").map(String::toInt)

        if ((H == 0) and (W == 0)) break

        println("${"#".repeat(W)}\n".repeat(H))
    }
}
