# Retry account operations

Create a retry function that allows retrying to deposit money to an account until the operation succeeds, for a given number of times.
The retry function should work with any function that returns an account.
If the number of retries is not specified, it should retry until it succeeds.

Use `main` function as a guideline on how retry can be used.

Have a look at [Util.kt](psi_element://Util.kt) for the rest of the implementation. 

<div class="hint">
Think about higher order functions.
</div>

<div class="hint">
Would a recursive implementation be easier to read?
</div>
