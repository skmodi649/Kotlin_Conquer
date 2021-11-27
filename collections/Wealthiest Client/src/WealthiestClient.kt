import java.math.BigDecimal
import kotlin.contracts.contract

data class Client(val firstName: String, val lastName: String)
data class Account(
    val owner: Client,
    val iban: String,
    val product: String,
    val currency: String,
    val balance: BigDecimal
)
TODO()

/**
 * Example usage
 *
 * Should print Client(firstName=Jeff, lastName=Bezos)
 */
fun main() {
    val jeff = Client("Jeff", "Bezos")
    val jeffSavings = Account(jeff, "AM45ONXX1234567812345678", "Savings", "USD", BigDecimal(150_000_000_000))
    val jeffDebit = Account(jeff, "AM45ONXX1234567812345678", "Current", "USD", BigDecimal(62_400_000_000))
    val elon = Client("Elon", "Musk")
    val elonSavings = Account(elon, "SP43XXXX1234567812345678", "Savings", "RON", BigDecimal(651_200_000_000))

    val accounts = listOf(jeffDebit, elonSavings, jeffSavings)

    println(accounts.wealthiest)
}
