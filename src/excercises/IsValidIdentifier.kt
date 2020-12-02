package excercises

private val NAMES_OF_VARIABLES = listOf<String>(
    "name",     // true
    "_name",    // true
    "_12",      // true
    "",         // false
    "012",      // false
    "no$"       // false
)

public class IsValidIdentifier {

    private fun isValidIdentifier(s: String): Boolean {
        fun isValidCharacter(ch: Char) =
            ch == '_' || ch.isLetterOrDigit()

        if (s.isEmpty() || s[0].isDigit()) return false
        for (ch in s) {
            if (!isValidCharacter(ch)) return false
        }
        return true
    }


    fun checkNames() {
        for (name in NAMES_OF_VARIABLES) {
            println(isValidIdentifier(name))
        }
    }

}
