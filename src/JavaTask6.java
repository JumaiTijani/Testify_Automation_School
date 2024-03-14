//Write a code to reverse the string DEMOCRACY and get the word COME out of it.


public class JavaTask6 {
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        StringBuilder reversedWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            reversedWord.insert(0, word.charAt(i));

        }

        System.out.println(reversedWord.substring(4,8));
    }
}
