# Dynamic Conversion

Define a map to keep the conversion rates between different currencies.
Write a function that uses that map to convert an amount in a given currency to the requested currency. If the currency pair is not defined, throw an exception.
Conversion from/to the same currency should return the same amount.

<p>Use the following conversion rates:

| Rate | RON | EUR | USD | GBP |
| ---- | --- | --- | --- | --- |
| RON  | 1   | 0.2 | 0.25| 0.17|
| EUR  | 5   | 1   | 1.21| 0.86|
| USD  | 4   | 0.83| 1   | 0.71|
| GBP  | 5.88| 1.16| 1.41| 1   |

<div class="hint">
Could a map have a conversion pair as key?
</div>
