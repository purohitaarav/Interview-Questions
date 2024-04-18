public class Interview {

    // Method to check if a given char array is a palindrome
    public static boolean isPalindrome(char[] array, int length) {
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to count vowels in a char array and print their counts and positions
    public static void vowels(char[] array, int length){
        // Initialize arrays to store vowel counts and positions
        int[] vowelCount = new int[5]; // 0: a, 1: e, 2: i, 3: o, 4: u
        String[] vowelPositions = new String[5];
        for(int i = 0; i < 5; i++) {
            vowelPositions[i] = ""; // Initialize each element as an empty string
        }
        // Iterate through the char array
        for(int i = 0; i < length; i++){
            char c = Character.toLowerCase(array[i]); // Convert char to lowercase
            // Check if the character is a vowel and update counts and positions accordingly
            if (c == 'a') {
                vowelCount[0]++;
                vowelPositions[0] += (i) + ", ";
            } else if (c == 'e') {
                vowelCount[1]++;
                vowelPositions[1] += (i)  + ", ";
            } else if (c == 'i') {
                vowelCount[2]++;
                vowelPositions[2] += (i)  + ", ";
            } else if (c == 'o') {
                vowelCount[3]++;
                vowelPositions[3] += (i)  + ", ";
            } else if (c == 'u') {
                vowelCount[4]++;
                vowelPositions[4] += (i)  + ", ";
            }
        }

        // Array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // Iterate through the vowel counts and print information about each vowel
        for (int i = 0; i < 5; i++) {
            if (vowelCount[i] > 0) {
                System.out.println("Vowel " + vowels[i] + " shows up " + vowelCount[i] + " times and in positions: " + vowelPositions[i]);
            }
        }
    }

    // Method to analyze text from a file, checking for palindromes and counting vowels
    public static void analyzeText(String inputFile) {
        // Set the input file
        StdIn.setFile(inputFile);
        // Read lines from the file until it's empty
        while (!StdIn.isEmpty()) {
            String line = StdIn.readLine(); // Read a line
            String[] words = line.split("\\s+"); // Split the line into words
            // Iterate through the words in the line
            for (String word : words) {
                if (isPalindrome(word.toCharArray(), word.length())) { // Check if the word is a palindrome
                    System.out.println(word + " is a palindrome.");
                }
                vowels(word.toCharArray(), word.length()); // Count vowels in the word
            }
        }
    }

    // Method to check if a number is prime
    public static void isItPrime(int number) {
        if (number <= 1) {
            System.out.println("Not Prime");
        }
        if (number == 2) {
            System.out.println("Prime");
        }
        if (number % 2 == 0) {
            System.out.println("Not Prime");
        }

        // Iterate through odd numbers starting from 3 up to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                System.out.println("Not Prime");
            }
        }
        System.out.println("Prime");
    }
}
