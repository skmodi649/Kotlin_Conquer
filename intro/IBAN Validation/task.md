# Naive IBAN Validation


Validate that, when instantiating an Account, the IBAN has the following structure:

- 2-letter country code
- 2-digit check number
- 4-letter bank code
- 16-digit bank account number
- all letters should be upper case

Example: RO20XXXX1234567812345678

<div class="hint">
  The length is fixed.
</div>
<div class="hint">
  Can a regex be used? 
</div>
