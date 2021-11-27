import kotlin.random.Random


fun fail(probability: Int) {
    if (probability > 0 && Random.nextInt(100) <= probability)
        throw IllegalStateException("simulated side effect exception")
}

/**
 * Example usage
 *
 * Example output:
 *
 * try no 1
 *
 * try no 2
 *
 * try no 3
 *
 * the first result is 10
 *
 * try no 1
 *
 * the second result is success
 */
fun main() {
    val n = retry {
        println("try no $it")
        fail(70)
        10
    }
    println("the first result is $n")

    val s: String = retry {
        println("try no $it")
        fail(50)
        "success"
    }
    println("the second result is $s")
}
