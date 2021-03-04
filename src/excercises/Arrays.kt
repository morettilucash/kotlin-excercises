package excercises

class Arrays {

    init {
        arrayOne()
        arrayTwo()
    }

    private fun arrayTwo() {
        val fruits = arrayOf("Banana","Blueberry","Pomegranate","Cherry")
        for ((index, fruit) in fruits.withIndex())
            println("Fruit = $fruit - Index: $index" )
        // for ( f in fruits) println("Fruit = $f" )
        // fruits.map { println("Fruit = " to it) }
    }

    private fun arrayOne() {
        val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
        var x = 0

        while (x < hobbits.size) {
            println("${hobbits[x]} -> Hobbit name")
            x += 1
        }
    }
}