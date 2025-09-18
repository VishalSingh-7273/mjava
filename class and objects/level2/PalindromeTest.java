// PalindromeChecker.java
class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is a palindrome
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase(); // ignore spaces & case
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}

// Main class
public class PalindromeTest {
    public static void main(String[] args) {
        // Create PalindromeChecker objects
        PalindromeChecker p1 = new PalindromeChecker("Madam");
        PalindromeChecker p2 = new PalindromeChecker("Hello");
        PalindromeChecker p3 = new PalindromeChecker("A man a plan a canal Panama");

        // Display results
        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
    }
}
