//Write a code that asks the user for age and that accepts the Integer value.
//Handle the error that is encountered when the users try's to enter a name instead of age




import java.util.Scanner;

public class JavaTask18 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int age;

        while (true) {
            try {
                System.out.print("Please enter your age: ");
                String input = userInput.nextLine();
                age = Integer.parseInt(input);
                break;
            } catch (Exception invalidInput) {
                System.out.println("Invalid input: Please enter your age.");
                System.out.println(invalidInput);
            }
        }

        System.out.println("You are " + age + "years old");
    }
}
