import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DepositMoneyExtTest {

    @Test
    fun `should add the money to account`() {
        val account = Account("RO90XXXX1234567812345678", "Deposit", "RON", "200.0".toBigDecimal())
        val result = account.deposit("99.5".toBigDecimal())

        with(result) {
            assertEquals(account.iban, iban)
            assertEquals(account.product, product)
            assertEquals(account.currency, currency)
            assertEquals("299.5".toBigDecimal(), balance)
        }
    }

    @Test
    fun `original instance should be the same`() {
        val account = Account("RO90XXXX1234567812345678", "Deposit", "RON", "200.0".toBigDecimal())
        account.deposit("99.5".toBigDecimal())

        with(account) {
            assertEquals("RO90XXXX1234567812345678", iban)
            assertEquals("Deposit", product)
            assertEquals("RON", currency)
            assertEquals("200.0".toBigDecimal(), balance)
        }
    }

}