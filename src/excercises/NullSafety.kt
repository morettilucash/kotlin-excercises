package excercises

class NullSafety {

    init {
        checkingForNullInConditions()
        safeCalls()
        elvisOperator()
        notNullAssertionOperator()
        filterNonNullElements()
    }

    private fun checkingForNullInConditions() {
        // short:
        // val l = if (b != null) b.length else -1

        // more complex conditions:
        val b: String? = "Kotlin"
        if (b != null && b.length > 0) {
            println("String of length ${b.length}")
        } else {
            println("Empty string")
        }
    }

    private fun safeCalls() {
        // second option is the safe call operator, written ?.:
        val a = "Kotlin"
        val b: String? = null
        println(b?.length)
        println(a?.length)

        // To perform a certain operation only for non-null values, you
        // can use the safe call operator together with let:
        val listWithNulls: List<String?> = listOf("Kotlin", null)
        for (item in listWithNulls) {
            item?.let { println("Item: $it") } // prints Kotlin and ignores null
        }
    }

    private fun elvisOperator() {
        // If the expression to the left of ?: is not null, the elvis operator returns it,
        // otherwise it returns the expression to the right. Note that the right-hand side
        // expression is evaluated only if the left-hand side is null:
        val b: String? = null
        // val b = "Kotlin"
        val l = b?.length ?: -1
        println(l)

        // Note that, since throw and return are expressions in Kotlin, they can
        // also be used on the right hand side of the elvis operator. This can be
        // very handy, for example, for checking function arguments:
        // fun foo(node: Node): String? {
        //     val parent = node.getParent() ?: return null
        //     val name = node.getName() ?: throw IllegalArgumentException("name expected")
        //     // ...
        // }
    }

    private fun notNullAssertionOperator() {
        val b: String? = null
        // val b = "Kotlin"
        val l = b!!.length
        println(l)
    }

    private fun filterNonNullElements() {
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        println(intList)
    }

}