# Generic <code>CensoredList</code>

Refactor the `CensoredList` implementation from the _Censored List_ exercise in the _OOP_ lesson to be able to handle any type, not just `String`.

Create a function `disclose` that receives a censored list and evaluates to a `String` that represents the original `toString` representation of the `List`. 

Have a look at `main` function for example usages.

<div class="hint">
    What should be the relation between the list's type parameter and the return type of the predicate that filters the elements?
</div>

<div class="hint">
    Is there any variance that could be safely declared at the declaration site?
</div>
