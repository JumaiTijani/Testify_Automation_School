//Given a collection of 1 million integers, all ranging between1 to 9, sort them in Big O(n) time

import java.util.Arrays;
public class JavaCodingChallenge8 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2, 6, 8, 9, 7, 1, 2, 3, 5, 9, 2, 4, 5, 6, 7, 8, 9, 1, 2};

        countingSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int[] counts = new int[10];

        for (int numbers : arr) {
            counts[numbers]++;
        }

        int index = 0;
        for (int n = 1; n < counts.length; n++) {
            while (counts[n] > 0) {
                arr[index++] = n;
                counts[n]--;
            }
        }
    }
}
