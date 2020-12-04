package excercises

/**
 * Because extensions are static functions under the hood, there is no override
 * for extensions, they cannot be overridden in Kotlin
 *
 * extensions can't be overridden because they're resolved the same way as
 * static Java methods.
 *
 * An extension can't hide a member completely, but can overload it
 */
class ToExtension {

    init {
        val sumOriginal = sumOriginal(listOf(1, 2, 3))
        println("==> sumOriginal: $sumOriginal")    // 6

        val sumToExtension = listOf(1, 2, 3).sumToExtension()
        println("==> sumToExtension: $sumToExtension")    // 6
    }

    // Función convertida a Extension:
    fun List<Int>.sumToExtension(): Int {
        var result = 0
        for (i in this) {
            result += i
        }
        return result
    }

    // Función original:
    fun sumOriginal(list: List<Int>): Int {
        var result = 0
        for (i in list) {
            result += i
        }
        return result
    }
}