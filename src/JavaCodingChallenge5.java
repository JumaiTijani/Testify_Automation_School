//Create anagram buckets from a given input array of words:input is {"akka", "akak", "baab", "baba", "bbaa"}

import java.util.*;
public class JavaCodingChallenge5 {
    public static void main(String[] args) {
        String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
        List<List<String>> anagramBuckets = createAnagramBuckets(input);

        for (List<String> bucket : anagramBuckets) {
            System.out.println(bucket);
        }
    }

    public static List<List<String>> createAnagramBuckets(String[] input) {
        Map<String, List<String>> buckets = new HashMap<>();

        for (String word : input) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (!buckets.containsKey(sortedWord)) {
                buckets.put(sortedWord, new ArrayList<>());
            }
            buckets.get(sortedWord).add(word);
        }

        return new ArrayList<>(buckets.values());
    }
}

