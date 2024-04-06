//Write a java code to check if  "racecar" and "10801" is a palindromes

public class JavaCodingChallenge1 {
    public static void main(String[] args) {
        String word1 = "racecar";
        String word2 = "10801";

        if (isPalindrome(word1)) {
            System.out.println(word1 + " is a palindrome.");
        } else {
            System.out.println(word1 + " is not a palindrome.");
        }

        if (isPalindrome(word2)) {
            System.out.println(word2 + " is a palindrome.");
        } else {
            System.out.println(word2 + " is not a palindrome.");
        }
    }


    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;


   }

}

