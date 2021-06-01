package customAccessor

class CustomAccessor(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {//声明属性的getter
            return height == width
        }
}

fun main() {
    println(CustomAccessor(12,12).isSquare)
}