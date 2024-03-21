//SUPER: Class B is extending Class A, Class B has a variable String name = "Anderson"
//while Class A has the same variable name and type is an attribute "Ronke".
//Print out the value of Class A and class B in your main method using the object of only One class.
//(Don't create two objects)


package JavaTask19C;

public class ClassB extends ClassA{
    String name = "Ronke";

    public static void main(String[] args) {
        ClassB object = new ClassB();
        object.printName();
    }

    public void printName(){
        System.out.println("My name is: " + super.name);
        System.out.println("My name is: " + name);
    }
}
