
/**
 * Example usage.
 *
 * Should print:
 *
 * `[a, giant, ***, ***, is, invading, the, earth]`
 *
 * `[-1, ***, 2, 1, ***, 5]`

 * `[-1, 0, 2, 1, 0, 5]`
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

    val youGetNoZeroesFromMe = censoredListOf(-1, 0, 2, 1, 0, 5) { it == 0 }
    println(youGetNoZeroesFromMe)

    println(disclose(youGetNoZeroesFromMe))
}
