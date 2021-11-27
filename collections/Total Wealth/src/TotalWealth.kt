import java.math.BigDecimal

data class Account(
    val iban: String,
    val product: String,
    val currency: String,
    val balance: BigDecimal
)

TODO()

/**
 * Example usage
 *
 * Should print 576015.25
 */
fun main() {
    val savings = Account("AM45ONXX1234567812345678", "Savings", "USD", "12500".toBigDecimal())
    val current = Account("RE45ONXX1234567812345673", "Current", "EUR", "105203.05".toBigDecimal())

    val accounts = listOf(current, savings)

    println(accounts.totalWealth("RON"))
}