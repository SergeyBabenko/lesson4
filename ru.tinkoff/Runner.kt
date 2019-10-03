import models.*

fun main() {
    val animalsForAdaptation: Array<Pet> =
        arrayOf(
            Cat("Salem", 13),
            Dog("Rex", 10),
            Fish("Nemo", 1),
            Parrot("Kesha", 4),
            Snake("Monty", 3)
        )

    play(animalsForAdaptation)
}

fun selectAnimal(animals: Array<Pet>): Pet {
    var index: Int?
    do {
        println("Available animals:")
        animals.forEach { println("${animals.indexOf(it)}. $it") }
        print("Select an animal: ")
        index = readLine()?.trim()?.toIntOrNull()
        if (index !in animals.indices)
            println("Incorrect input. Try again")
    } while (index !in animals.indices)
    return animals[index!!]
}

fun play(animalsForAdaptation: Array<Pet>) {
    var isDirty = false
    val owner = Owner()
    val selectedAnimal = selectAnimal(animalsForAdaptation)
    owner.adoptPet(selectedAnimal)
    while (owner.hasPet()) {
        println("Available actions:")
        println("0. Feed the pet")
        println("1. Clean up")
        print("Select an action: ")
        when (readLine()?.trim()?.toIntOrNull()) {
            0 -> {
                owner.feedPet()
                if (isDirty) {
                    println("Very dirty!")
                    owner.lostPet()
                } else
                    isDirty = true
            }
            1 -> {
                owner.cleanUp()
                isDirty = false
            }
            else -> println("Incorrect input. Try again")
        }
    }
}


