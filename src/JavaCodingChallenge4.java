//Write  a  Java code  to  check  for  the Prime  numbers between 1-100

public class JavaCodingChallenge4 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int number) {

        for (int n = 2; n <= Math.sqrt(number); n++) {
            if (number % n == 0) {
                return false;
            }
        }

        return true;
    }
}
