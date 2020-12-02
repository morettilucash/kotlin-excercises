package excercises

class Collections() {
    // Standard Java collections:
    // Cuando se crean colecciones usando las funciones de Kotlin standard library,
    // se crean instanciaas de las clases standard de Java
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    init {
        println(set.javaClass)
        println(list.javaClass)
        println(map.javaClass)
    }

}