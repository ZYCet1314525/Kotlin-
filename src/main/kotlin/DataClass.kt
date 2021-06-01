/*
* 数据类：专用于只“保存”数据的类，比如用户自动登录信息，聊天记录等
* 这里的保存并不是指保存到磁盘，而是指转换成文本格式，便于保存
* Kotlin数据类：data class 类名（属性列表）
*
* */

data class  Article(var id:Int,var title:String,var content:String)

fun main(args: Array<String>) {
    val artical=Article(1001,"Kotlin快速入门","我写的文章")
    //数据类序列化
    println(artical.toString())
    //复制：生成一个对象的克隆，并更改部分属性
    val articalnew=artical.copy(title = "今日开卖")
    println(articalnew.toString())

    //数据类对象的解构
    val (id,title)=artical
    println("${id},${title}")
    //componentN  列举属性
    println("${artical.component2()}，${artical.component3()}")
    println("=============================================================")

    var book = Book("Android tutorials","Anupam", 1234567, 4.5f, 1000)
    book = Book("Kotlin")
    book = Book("Swift",downloads = 500)
    book = Book("Java","Pankaj",rating = 5f, downloads = 1000)
    book = Book("Python","Shubham",rating = 5f)
    println(book)

}

data class Book(var name: String, var authorName: String = "Anupam", var lastModified: Long = 1234567, var rating: Float = 5f, var downloads: Int = 1000)
