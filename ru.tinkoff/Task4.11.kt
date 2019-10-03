open class Cat {
    open fun hunt() {
        println("Я охочусь на мышей, ведь я кот!")
    }
}

class HomeCat : Cat() {
    fun hunt(likeWild: Boolean) {
        if (likeWild) super.hunt()
        else println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
    }
}

fun main() {
    val hc = HomeCat()
    hc.hunt(true)
    hc.hunt(false)
}