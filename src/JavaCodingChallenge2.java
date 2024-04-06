//Reverse the position of words in "I am the best Automation Tester" using recursion
public class JavaCodingChallenge2 {
    public static void main(String[] args) {
        String words = "I am the best Automation Tester";
        String reversedWords = reverseStatement(words);
        System.out.println(reversedWords);
    }

    public static String reverseStatement(String words) {
        if (words == null || !words.contains(" ")) {
            return words;
        }

        int spaceIndex = words.indexOf(' ');

        if (spaceIndex == -1) {
            return words;
        }

        String reverse = reverseStatement(words.substring(spaceIndex + 1)) + " ";

        reverse += words.substring(0, spaceIndex);

        return reverse;
    }
}
