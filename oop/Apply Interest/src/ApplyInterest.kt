//solution goes here

object TodayProvider {
    fun today(): LocalDate = LocalDate.now()
}

/**
 * Example usage
 *
 * Should print:
 *
 * true
 *
 * 100003.000
 */
fun main() {
    run {
        val account =
            TermDeposit("RO88TERM12345678123445678", 100_000.toBigDecimal(), SEMESTER, "5.2".toBigDecimal())
        val withInterest = account.applyInterest()
        println(account == withInterest)
    }

    run {
        val account = SavingsAccount("RO88TERM12345678123445678", 100_000.toBigDecimal(), "0.003".toBigDecimal())
        val withInterest = account.applyInterest()
        println(withInterest.balance)
    }
}
