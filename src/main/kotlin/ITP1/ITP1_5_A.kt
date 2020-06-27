package ITP1

fun main(args: Array<String>) {
    while (true) {
        val (H, W) = readLine()!!.split(" ").map(String::toInt)

        if ((H == 0) and (W == 0)) break

        for (i in 1..H) {
            for (j in 1..W) {
                print("#")
            }
            println()
        }
        println()
    }
}
