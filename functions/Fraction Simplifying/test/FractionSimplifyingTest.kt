import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FractionSimplifyingTest {
    @Test
    fun `the fraction should be reduced`() {
        val fraction = Fraction(100, 5)

        with(fraction) {
            assertEquals(20, numerator)
            assertEquals(1, denominator)
        }
    }

    @Test
    fun `the fraction cannot be reduced`() {
        val fraction = Fraction(4, 7)

        with(fraction) {
            assertEquals(4, numerator)
            assertEquals(7, denominator)
        }
    }
}