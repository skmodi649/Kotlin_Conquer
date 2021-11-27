import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlusOperatorTest {

    @Test
    fun `plus when denominator is the same`() {
        val result = Fraction(3, 4) + Fraction(1, 4)

        with(result) {
            assertEquals(1, numerator)
            assertEquals(1, denominator)
        }
    }

    @Test
    fun `should add fractions with different denominator`() {
        val result = Fraction(3, 7) + Fraction(9, 13)

        with(result) {
            assertEquals(102, numerator)
            assertEquals(91, denominator)
        }
    }

    @Test
    fun `should add Fraction to Int`() {
        val result = 5 + Fraction(3, 5)

        with(result) {
            assertEquals(28, numerator)
            assertEquals(5, denominator)
        }
    }
}