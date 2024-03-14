//Create a method that verify that visitors on the slack channel are coming for testify Trainings.
// If they write" Testify" then print out a  welcome message if not , the user should be shown rejection message.
// after creating this method,then invoke the created method in your main method


public class JavaTask10 {

    public static void main(String[] args) {
        String message = "I'm here for the Testify trainings.";
        verifyVisitor(message);
    }

    public static void verifyVisitor(String message) {
        if (message.contains("Testify")) {
            System.out.println("Welcome to the Testify");
        } else {
            System.out.println("Sorry, you can't access this channel.");
        }
    }


}