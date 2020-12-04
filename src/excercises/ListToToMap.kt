package excercises

import kotlin.test.assertTrue

class User(
    val name: String,
    val age: Int,
    val listOf: List<String>
) {}

class ListToToMap() {
    val user1 = User("John", 18, listOf("Hiking"))
    val user2 = User("Sara", 25, listOf("Chess"))
    val user3 = User("Dave", 34, listOf("Games"))

    fun givenList_whenConvertToMap_thenResult() {
        val myList = listOf(user1, user2, user3)
        // “to” keyword is being used here to create pairs of names and ages.
        // This method should return a map that preserves the entry order of
        // the elements in the array:
        val myMap = myList.map { it.name to it.age }.toMap()
        assertTrue(myMap.get("John") == 18)
        println("myMapToMap: $myMap")

    }


}