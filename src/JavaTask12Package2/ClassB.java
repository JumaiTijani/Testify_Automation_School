//Create two packages.
//in each of the packages create one class each Class A and Class B.
//create a method in class A that can be accessed anywhere in that project and
//create a method in Class B that can only be accessed within a class.


package JavaTask12Package2;

import JavaTask12Package1.ClassA;

public class ClassB {
    public static void main(String[] args) {
    }

    private void classBMethod(){
        System.out.println("This is a private method for ClassB");
    }

}
