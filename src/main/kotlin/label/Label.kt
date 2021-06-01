package label

class Label {

}

fun main() {
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach here@{
        // 指令跳转到 lambda 表达式标签 here@ 处。继续下一个it=4 的遍历循环
        if (it == 3) return@here
        println(it)
    }

    intArray.forEach {
        // 指令跳转到 lambda 表达式 forEach 处。继续下一个it=4 的遍历循环
        if (it == 3) return@forEach
        println(it)
    }
}

