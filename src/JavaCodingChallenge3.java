//Find two numbers of which the product is maximum in an array

public class JavaCodingChallenge3 {
    public static void main(String[] args) {
        int[] number = {-5, 7, 3, 15, 5};
        int[] maxNumbers = maxProductNumbers(number);
        System.out.println("The two numbers with the maximum product are " + maxNumbers[0] + " and " + maxNumbers[1]);
    }

    public static int[] maxProductNumbers(int[] number) {

        int maxProduct = Integer.MIN_VALUE;
        int[] result = new int[2];

        for (int n = 0; n < number.length; n++) {
            for (int p = n + 1; p < number.length; p++) {
                int product = number[n] * number[p];
                if (product > maxProduct) {
                    maxProduct = product;
                    result[0] = number[n];
                    result[1] = number[p];
                }
            }
        }

        return result;
    }
}

