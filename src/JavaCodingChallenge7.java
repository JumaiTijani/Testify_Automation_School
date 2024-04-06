//Reverse "TestifyAutomation" using recursion in Java


public class JavaCodingChallenge7 {
    public static void main(String[] args) {
        String String = "TestifyAutomation";
        String reversedString = reverseString(String);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String word) {
        if (word.isEmpty()) {
            return word;
        }

        return reverseString(word.substring(1)) + word.charAt(0);
    }
}

