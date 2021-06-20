package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val result = a.toUpperCase().filter { b.contains(it) }
        return if (result == b) "YES" else "NO"
    }
}
