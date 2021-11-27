# Apply Interest

Extend the `Account` hierarchy presented in the `sealed classes` topic to include a new kind of account: `TermDeposit`.
Besides `iban` and `balance`, a term deposit should have a `term` of type `Local Date` and `interest` of type `Double`.

To construct a term deposit, provide a `TermType` as parameter instead the actual term date.
`TermType` can be month, quarter, semester and year. When building a `TermDeposit`, the `term` is automatically computed
by adding to the current date the corresponding `TermType`.

Extend the `Account` with a function `applyInterest` that returns an `Account` with the following rules:
- Savings: add the interest to the balance
- Credit: adds the interest to the balance if the balance is negative
- Current and Technical: have no interest - remain unchanged
- Term: remains unchanged if the term is not yet reached, adds the interest and transforms the account into a current account
if the term was reached

Use `TodayProvider.today()` to get the current date.

Have a look at `main` function for example usages.
