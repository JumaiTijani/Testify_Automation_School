//Using  Java  Code,  check  for  Anagrams  in  these  strings:
//"Despite commuting at the peek hour, she was able to keep to time"


import java.util.*;
public class JavaCodingChallenge6 {
    public static void main(String[] args) {
        String strings = "despite commuting at the peek hour, she was able to keep to time";
        String[] words = strings.split("\\s+");


        for (int a = 0; a < words.length; a++) {
            for (int s = a + 1; s < words.length; s++) {
                if (areAnagrams(words[a], words[s])) {
                    System.out.println("Anagrams in the strings: " + words[a] + " and " + words[s]);
                }
            }
        }
    }

    public static boolean areAnagrams(String word1, String word2) {

        word1 = word1.replaceAll("\\p{Punct}", "");
        word2 = word2.replaceAll("\\p{Punct}", "");

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
