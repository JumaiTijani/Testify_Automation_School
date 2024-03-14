//Write a logic that takes in input from the user.
// It keeps printing "try again "until the user enters "testify"


import java.util.Scanner;

public class JavaTask9B {
    public static void main(String[] args) {
        Scanner logic = new Scanner(System.in);
        String input = "";

        while(!input.equalsIgnoreCase("testify")){
            System.out.println("try again");
            input = logic.nextLine();
        }

    }
}
