import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConvertToEurTest {

    @Test
    fun `should convert RON`() {
        val result = convertToEur("RON", 15.7)
        Assertions.assertEquals(3.14, result, 0.01)
    }

    @Test
    fun `should convert USD`() {
        val result = convertToEur("USD", -5.7)
        Assertions.assertEquals(-4.56, result, 0.01)
    }

    @Test
    fun `should convert GBP`() {
        val result = convertToEur("GBP", 11.4)
        Assertions.assertEquals(13.68, result, 0.01)
    }


}