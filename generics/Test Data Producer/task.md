# Fake Test Data Producer

Create a class or interface `TestDataProducer` that has a member function `fakeIt` that can potentially generate any type of data.
Provide implementations for `Int`, `Double` and `String`. The implementations should generate a random instance of that type.

Create a top level function `fakeIt` that dynamically chooses the type using type inference. `fakeIt` should work with any non-null type.

There's also the special case of nullable types. Create another function `fakeIt?` that returns an instance of the actual type with a 90% probability, or `null` with a 10% probability.

Have a look at `main` function for example usages.

<div class="hint">
    Is there any variance that could be safely declared at the declaration site?
</div>

<div class="hint">
    Is there any way to reuse code between <code>fakeIt</code> and <code>fakeIt?</code>?
</div>
