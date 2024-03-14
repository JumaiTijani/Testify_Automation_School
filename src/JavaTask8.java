//Build a Simple interest calculator.
//Write a program to ask the user for the necessary field you need in calculating the simple interest and then
//communicate the simple interest back to the user in a good sentence


import java.util.Scanner;

public class JavaTask8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter Principal amount");
        int principal = userInput.nextInt();
        System.out.println("Please enter interest rate as percentage");
        double interestRate = userInput.nextInt();
        System.out.println("Please enter time in month");
        double time = userInput.nextInt();

        double simpleInterestRate = principal * interestRate/100 * time/12;
        System.out.println("Given the details you have provided, your interest rate is:" + simpleInterestRate);

    }
}



