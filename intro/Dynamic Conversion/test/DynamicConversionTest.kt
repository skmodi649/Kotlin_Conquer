import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class DynamicConversionTest {

    @ParameterizedTest(name = "same currency should return same amount: {0}")
    @ValueSource(strings = ["EUR", "RON", "XXX", "USD", "GBP"])
    fun `same currency should return same amount`(currency: String) {
        Assertions.assertEquals(1.55, convert(fromCurrency = currency, toCurrency = currency, amount = 1.55))
    }

    @ParameterizedTest(name = "check conversion from {0} to {1}")
    @CsvSource(
        *["RON,EUR,0.51", "RON,USD,0.63", "RON,GBP,0.43",
            "EUR,RON,12.75", "EUR,USD,3.08", "EUR,GBP,2.19",
            "USD,RON,10.20", "USD,EUR,2.11", "USD,GBP,1.81",
            "GBP,RON,14.99", "GBP,EUR,2.95", "GBP,USD,3.59"]
    )
    fun `check conversion from {0} to {1}`(fromCurrency: String, toCurrency: String, expectedAmount: Double) {
        Assertions.assertEquals(expectedAmount, convert(fromCurrency, toCurrency, 2.55), 0.01)
    }
}