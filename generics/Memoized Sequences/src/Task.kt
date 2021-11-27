// type your solution here
/**
 * Example usage.
 *
 * Should not print duplicated "Computing i"
 *
 * Should output:
 *
 * Computing: 1
 *
 * Computing: 2
 *
 * 2
 *
 * Computing: 3
 *
 * 3
 *
 * Computing: 4
 *
 * Computing: 5
 *
 * 5
 *
 * Computing: 6
 *
 * Computing: 7
 *
 * Computing: 8
 *
 * Computing: 9
 *
 * Computing: 10
 *
 * Computing: 11
 *
 * 11
 *
 */
fun main() {
    val primes = generateSequence(1) { it + 1 }
        .map { it.toBigInteger() }
        .onEach { println("Computing: $it") }
        .filter { it.isProbablePrime(100) }
        .memoize()

    val n1 = 3

    //print first n1 primes
    primes.take(n1).forEach(::println)

    val n2 = 5
    //print nth prime
    primes.drop(n2 - 1).first().let(::println)
}
