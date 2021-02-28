package excercises

class Collections() {
    // Standard Java collections:
    // Cuando se crean colecciones usando las funciones de Kotlin standard library,
    // se crean instanciaas de las clases standard de Java
    private val set = hashSetOf(1, 7, 53)
    private val list = arrayListOf(1, 7, 53)
    private val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    init {
        println("==================")
        println("HashSet javaClass: " + set.javaClass)
        println("Set: $set")
        println("==================")
        println("List javaClass: " + list.javaClass)
        println("List: $list")
        println("==================")
        println("HashSet javaClass: " + map.javaClass)
        println("Map: $map")
    }

}