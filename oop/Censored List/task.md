# Censored List

Extend the `CensoredList` presented during the course to be able to provide a dynamic way of censoring the words.
Use a function `(String) -> Boolean` to decide if a word needs censoring.

Here is the original code: 
```kotlin
class CensoredList private constructor(private val delegate: List<String>) :
    List<String> by delegate {
    companion object {
        fun censoredListOf(vararg args: String) = CensoredList(listOf(*args))
    }

    override fun toString(): String =
        delegate.map { if (it == "spaghetti") "***" else it }.toString()
}
```
Have a look at `main` function for example usages.
