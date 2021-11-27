// your code goes here
/**
 * Example usage.
 *
 * Should print: `[a, giant, ***, ***, is, invading, the, earth]`
 *
 */
fun main() {
    val words = censoredListOf(
        "a",
        "giant",
        "spaghetti",
        "monster",
        "is",
        "invading",
        "the",
        "earth"
    ) { w -> w in setOf("spaghetti", "monster") }
    println(words)
}
