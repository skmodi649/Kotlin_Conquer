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
 * Should print {EUR=2573.34, RON=100.1}
 */
fun main() {
    val account1 = Account("RO10XXXX1234567812345671", "Deposit", "EUR", "100.02".toBigDecimal())
    val account2 = account1.copy(balance = "2453.12".toBigDecimal())
    val account3 = account1.copy(balance = "20.20".toBigDecimal())
    val account4 = account1.copy(currency = "RON", balance = "100.1".toBigDecimal())

    val accounts = listOf(account1, account2, account3, account4)

    println(accounts.balanceByCurrency())
}