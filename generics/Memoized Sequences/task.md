# Memoized Sequence

Infinite sequences are great, but as we learned in the _Collections_ lesson
they are lazy. For a sequence that does complex calculations that may not always be
a good idea, from a performance point of view.

In functional programming, pure functions (or referential transparent functions)
are safe to _memoize_, which is just a fancy word for caching their result for
subsequent calls.

What if we could do that for sequences, so that reusing a _memoized_ sequence doesn't 
trigger the computations up to memoization again.

Create a function `memoize` that caches the results of the any sequence. Do not worry about
concurrency yet, we will cover that when we get to coroutines.

Have a look at `main` function for example usages.
