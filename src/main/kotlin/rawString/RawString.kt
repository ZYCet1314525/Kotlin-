package rawString

import java.lang.Integer.parseInt

class RawString {
}

fun main(args: Array<String>) {
    val rawString = """
    fun helloworld(name:String){
        println("Hello, world!")
    }
    """
}

fun switch(x: Int) {
    val s = "123"
    when (x) {
        -1, 0 -> print("x == -1 or x == 0")
        1 -> print("x == 1")
        2 -> print("x == 2")
        8 -> print("x is 8")
        parseInt(s) -> println("x is 123")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }
}


