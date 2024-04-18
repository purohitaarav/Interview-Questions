# Interview Java Code README

This README provides an overview of the Java code in the "Interview" class. The code contains methods for analyzing text, checking for palindromes, counting vowels, and determining if a number is prime.

## Methods

### 1. `isPalindrome(char[] array, int length)`

- **Description**: Checks if a given character array is a palindrome.
- **Parameters**:
  - `array`: Character array to be checked.
  - `length`: Length of the character array.
- **Returns**: `true` if the array is a palindrome, `false` otherwise.

### 2. `vowels(char[] array, int length)`

- **Description**: Counts the occurrences of vowels in a character array and prints their counts and positions.
- **Parameters**:
  - `array`: Character array to be analyzed.
  - `length`: Length of the character array.

### 3. `analyzeText(String inputFile)`

- **Description**: Reads text from a file, identifies palindromes, and counts vowels in each word.
- **Parameters**:
  - `inputFile`: Path to the input file.

### 4. `isItPrime(int number)`

- **Description**: Checks if a given number is prime.
- **Parameters**:
  - `number`: The number to be checked.

## How to Use

1. **Running the Code**: You can use any Java IDE or compile and run the `Interview.java` file from the command line.

2. **Using `analyzeText` Method**: Provide the path to the input file as an argument to the `analyzeText` method to analyze text from a file.

3. **Testing Palindromes**: You can test for palindromes by using the `isPalindrome` method with a character array.

4. **Counting Vowels**: Use the `vowels` method to count vowels in a character array.

5. **Checking Prime Numbers**: Use the `isItPrime` method to check if a number is prime.

## Example

```java
public class Main {
    public static void main(String[] args) {
        // Analyze text from a file
        Interview.analyzeText("input.txt");

        // Test for palindrome
        char[] word = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        System.out.println("Is 'racecar' a palindrome? " + Interview.isPalindrome(word, word.length));

        // Count vowels
        char[] word2 = {'a', 'b', 'e', 'l', 'i', 'e', 'v', 'e'};
        Interview.vowels(word2, word2.length);

        // Check if a number is prime
        int number = 17;
        Interview.isItPrime(number);
    }
}
