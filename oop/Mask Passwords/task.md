# Mask Passwords
Try to make the `Mask` delegate from the course actually useful.
Here is the original code:
```kotlin
class User(val name: String) {
    val password: String by Mask()
}

class Mask {
    operator fun getValue(auditedClass: Any, property: KProperty<*>): String = "***"
}
```

Useful means:
- to be able to actually store a password
- to be able to retrieve the original password (via the `actualPassword` property)
- `password` property should keep returning _***_

Have a look at `main` function for example usages.

<div class="hint">
    Would it be possible that the <code>User</code> class has no direct reference to the original password?
</div>

<div class="hint">
    What happens if multiple threads try to initialize the same masked property in parallel?
</div>
