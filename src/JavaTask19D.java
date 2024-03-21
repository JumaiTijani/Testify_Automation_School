//THIS https://i.imgur.com/aRkRDPa.png You have a class with a method printName.
//write a code in the printName method that will print the instance member which is "Delta" and
//whatever name the user enter when invoking the method

public class JavaTask19D {
    String name ="Delta";

    public static void main(String[] args) {
        JavaTask19D name = new JavaTask19D();
        name.printName("Anthony");
    }

    public void printName(String name) {
        System.out.println("Instance member: " + this.name + " and User input: " + name );
    }
}
