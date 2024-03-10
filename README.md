# Luhn-Algorithm
### https://en.wikipedia.org/wiki/Luhn_algorithm

The Luhn Algorithm, also known as the Luhn formula or modulus 10 algorithm, is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers, IMEI numbers, National Provider Identifier numbers, and more. It's widely used to detect errors in data entry or transmission, as well as to detect accidental errors or fraud.

Here's how it works:

1. Starting from the rightmost digit, double the value of every second digit. If doubling the digit results in a number greater than 9, subtract 9 from the product. This effectively means adding the digits of the product together.
2. Add up all the digits in the modified number, including the unchanged digits from step 1.
3. If the total sum is a multiple of 10 (i.e., divisible by 10 with no remainder), then the number is valid according to the Luhn Algorithm.

Here's a step-by-step example with the number 79927398713:

1. Double every second digit, starting from the right:
   7 (unchanged), 9 (doubled to 18, then subtract 9 to get 9), 9 (unchanged), 2 (doubled to 4), 7 (unchanged), 3 (doubled to 6), 9 (unchanged), 8 (doubled to 16, then subtract 9 to get 7), 7 (unchanged), 1 (doubled to 2), 3 (unchanged).
   Result: 7 9 9 4 7 6 9 7 7 2 3
2. Add up all the digits: 7 + 9 + 9 + 4 + 7 + 6 + 9 + 7 + 7 + 2 + 3 = 70
3. Check if the total sum is a multiple of 10: 70 % 10 = 0

Since the total sum is divisible by 10, the number 79927398713 is valid according to the Luhn Algorithm. If any digit in the number were changed, the total sum wouldn't be a multiple of 10, indicating an error in the number.
