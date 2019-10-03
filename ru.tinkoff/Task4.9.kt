import java.util.Scanner
import kotlin.math.absoluteValue

class Car() {
    fun ride(km: Int) {
        var distance = km.absoluteValue
        println("Поехали!")
        while (distance != 0) {
            println("Осталось $distance километров")
            distance--
        }
        println("Приехали!")
    }
}

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}