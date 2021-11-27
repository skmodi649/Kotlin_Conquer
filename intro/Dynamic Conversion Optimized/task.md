# Dynamic Conversion Optimized

Define a map to keep the conversion rates between different currencies. The map contains only one way conversions.
Write a function that uses that map to convert an amount in a given currency to the requested currency. If the currency pair is not defined, throw an exception.
Conversion from/to the same currency should return the same amount.
<p>Use the following conversion rates:

| Rate | RON | EUR | USD | GBP |
| ---- | --- | --- | --- | --- |
| RON  |     | 0.2 | 0.25| 0.17|
| EUR  |     |     | 1.21| 0.86|
| USD  |     |     |     | 0.71|
| GBP  |     |     |     |     |
