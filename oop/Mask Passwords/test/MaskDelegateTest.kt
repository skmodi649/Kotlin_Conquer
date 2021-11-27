import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaskDelegateTest {

    private val user = User("parzival", "qwerty1234")

    @Test
    fun `should be able to receive the original password`() {
        assertEquals("qwerty1234", user.actualPassword)
    }

    @Test
    fun `password property should be masked`() {
        assertEquals("***", user.password)
    }
}
