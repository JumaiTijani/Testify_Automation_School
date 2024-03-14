//I have a list of numbers, 1-10,
// write a loop that prints odd if it is an odd number and
// a loop that prints even if it is an even number.



public class JavaTask9A {
    public static void main(String[] args) {
        for( int n = 1; n <= 10; n++){
            if (n % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }

        }

    }
}
