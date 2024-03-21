//Create two packages.
//in each of the packages create one class each Class A and Class B.
//create a method in class A that can be accessed anywhere in that project and
//create a method in Class B that can only be accessed within a class.

package JavaTask12Package1;

import JavaTask12Package2.ClassB;

public class ClassA {
    public static void main(String[] args) {
    }

    public void classAMethod(){
        System.out.println("This is a public method for ClassA");
    }
}
