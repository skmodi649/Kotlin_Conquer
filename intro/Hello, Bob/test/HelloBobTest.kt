import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertContains

class HelloBobTest {

    private val out = ByteArrayOutputStream()

    @BeforeEach
    fun setup() {
        System.setOut(PrintStream(out))
    }

    @Test
    fun `should greet Bob`() {
        main(arrayOf("Bob"))

        assertEquals("Hello, Bob!", out.toString().trim())
    }

    @Test
    fun `should greet the world when then name is missing`() {
        main(emptyArray())

        assertEquals("Hello, World!", out.toString().trim())
    }

}