package ITP1

fun main(args: Array<String>) {

    while (true) {
        val input = readLine()!!.split(" ")

        val a = input[0].toInt()
        val op = input[1]
        val b = input[2].toInt()

        when(op) {
            "+" -> println(a + b)
            "-" -> println(a - b)
            "*" -> println(a * b)
            "/" -> println(a / b)
            "?" -> return
        }
    }
}
