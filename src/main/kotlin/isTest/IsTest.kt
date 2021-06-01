package isTest

class IsTest {
    fun getLength(obj: Any):Int? {
        var result = 0
        if (obj is String) { // `obj` 在该条件分支内自动转换成 `String`
            println(obj::class) //class java.lang.String
            result = obj.length
            println(result)
        } // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
        println(obj::class) // class java.lang.Object
        return result
    }
}

fun main() {
    println(IsTest().getLength("abcdef"))
}