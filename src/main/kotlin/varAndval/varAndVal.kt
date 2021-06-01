package varAndval

class varAndVal {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)
    }

    fun declareVal() {
        val b = "a"
        println(b)
        println(b::class)
        println(b::class.java)

        val c: Int = 1
        val d = 2
        val e: Int
        e = 3
        println("c = $c, d = $d, e = $e ")
    }
}

fun main(args: Array<String>) {
    var test1 = varAndVal()
    test1.declareVar()
    test1.declareVal()
}
