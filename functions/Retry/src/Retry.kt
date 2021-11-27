//your code goes here
TODO()

fun main() {
    val account =
        Account("NL77BBBB1234567812345678", "Current Account", "EUR", "100".toBigDecimal())

    val updatedAccount = retry(2) {
        fail(50)
        account.deposit("3.5".toBigDecimal())
    }

    println(updatedAccount.balance)
}