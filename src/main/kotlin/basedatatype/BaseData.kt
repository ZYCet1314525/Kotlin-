package basedatatype

fun main() {
//    underline()
//    numberBox()
//    charTypeChange()
//    arrayTraverse()
//    arrayAssignment()
    arrayFactory()
//    stringIteration()
//    charCase()
}

/**
 * 使用下划线 让数据更易读
 */
fun underline() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
}

//数字装箱不一定保留同一性
fun numberBox() {
    //当i在[-128,127]区间,会从IntegerCache.cache中获取，在该区间之外会new Integer()对象，从而导致引用不一致。
    val a: Int = 127
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    val b: Int = 128
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
}

//char类型转换
fun charTypeChange() {
    var c: Char = 'a'
    if (c !in '0'..'z')
        throw IllegalArgumentException("Out of range")
    println(c.toInt() - 'A'.toInt())// 显式转换为数字
    println(c.code - 'A'.code)// 显式转换为数字
}

//array循环遍历
fun arrayTraverse() {
    arrayOfNulls<Int>(5)
    // 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}

//array赋值
fun arrayAssignment() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x[1] = x[0] + x[2]
    x[2] = x[0] + x[1]
    x[2] = x[0] + x[2]
    x.forEach { println(it) }

    // 大小为 5、值为 [0, 0, 0, 0, 0] 的整型数组
    val arr1 = IntArray(5)
    // 大小为 5、值为 [42, 42, 42, 42, 42] 的整型数组
    val arr2 = IntArray(5) { 42 }
    // 例如：使用 lambda 表达式初始化数组中的值
    // 大小为 5、值为 [0, 1, 2, 3, 4] 的整型数组（值初始化为其索引值）
    var arr3 = IntArray(5) { it * 1 }
        .forEach { println(it) }
}

//数组工厂函数
fun arrayFactory() {
    //工厂函数
    var arr1 = Array(5) { i -> (i * 2).toString() }
    for (a in arr1) {
        print(a)
        print("\t")  //输出结果为 0	2	4	6	8
    }
}

//字符串循环迭代
fun stringIteration() {
    val str = "abcd"
    for (c in str) {
        println(c)
    }
    val s = "abc" + 1
    println(s + "def")          //abc1def
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}

//字符大小写转换
fun charCase() {
    var a: Char = 'a'
    var b: Char = 'B'
    println(a.uppercaseChar())      //返回值为Char
    println(b.lowercase())          //返回值为String
}



