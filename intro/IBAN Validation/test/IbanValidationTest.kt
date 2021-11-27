import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IbanValidationTest {

    companion object {
        private const val VALID_ENDING = "1234567812345678"

        @JvmStatic
        fun nonLetters() = Stream.of("1", "{", "$", "8", "-")

        @JvmStatic
        fun nonDigits() = Stream.of("a", "B", "-", "_", "$")

        @JvmStatic
        fun alteredEndings() = nonDigits().flatMap { s -> (0 until 16).map { it to s }.stream() }
            .map { (i, s) -> VALID_ENDING.replaceRange(i..i, s) }
    }

    @Test
    fun `should initialize with valid iban`() {
        Assertions.assertDoesNotThrow {
            Account(iban = "RO20XXXX1234567812345678", product = "Current Account", currency = "EUR", balance = 0.0)
        }
    }

    @Test
    fun `should not allow empty iban`() {
        assertThrows(IllegalArgumentException::class.java) {
            Account(iban = "", product = "Current Account", currency = "EUR", balance = 0.0)
        }
    }

    @Test
    fun `should not allow shorter iban`() {
        assertThrows(IllegalArgumentException::class.java) {
            Account(iban = "RO20XXXX123456781234567", product = "Current Account", currency = "EUR", balance = 0.0)
        }
    }

    @Test
    fun `should not allow longer iban`() {
        assertThrows(IllegalArgumentException::class.java) {
            Account(iban = "RO20XXXX12345678123456789", product = "Current Account", currency = "EUR", balance = 0.0)
        }
    }

    @ParameterizedTest(name = "the first two characters should be letters: {0}")
    @MethodSource("nonLetters")
    fun `the first two characters should be letters`(nonLetter: String) {
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "${nonLetter}R20XXXX1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "R${nonLetter}20XXXX1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
    }

    @ParameterizedTest(name = "the second two characters should be digits: {0}")
    @MethodSource("nonDigits")
    fun `the second two characters should be digits`(nonDigit: String) {
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "NL${nonDigit}1XXXX1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "NL1${nonDigit}XXXX1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
    }

    @ParameterizedTest(name = "the next 4 characters should be letters: {0}")
    @MethodSource("nonLetters")
    fun `the next 4 characters should be letters`(nonLetter: String) {
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "NL10${nonLetter}XXX1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "NL10X${nonLetter}XX1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "NL10XX${nonLetter}X1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
        assertThrows(IllegalArgumentException::class.java) {
            Account(
                iban = "NL10ABC${nonLetter}1234567812345678",
                product = "Current Account",
                currency = "EUR",
                balance = 0.0
            )
        }
    }

    @ParameterizedTest(name = "the last 16 characters should be digits: {0}")
    @MethodSource("alteredEndings")
    fun `last 16 characters should be digits`(invalidEnding: String) {
        println(invalidEnding)
        assertThrows(IllegalArgumentException::class.java) {
            Account(iban = "RO99ABCD$invalidEnding", product = "Current Account", currency = "EUR", balance = 0.0)
        }
    }
}