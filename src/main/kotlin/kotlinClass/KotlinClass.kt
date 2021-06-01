package kotlinClass

class KotlinClass {
    private var name: String = "Tom"
    private var isMarried = false

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun isMarried(): Boolean {
        return isMarried
    }

    fun setMarried(married: Boolean) {
        isMarried = married
    }
}