//Create a parent class "A" with 3 methods.
//create a child class "B" with 2 methods.
//add a print statement in all the 5 methods.
//Invoke all 5 methods in a main method in the child class "B"

package JavaTask15;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassB car = new ClassB();
        car.superCar();
        car.model();
        car.horsePower();
        car.cylinderEngine();
        car.price();
    }
    public void cylinderEngine(){
        System.out.println("The Lamborghini Revuelto has a V-12 cylinder engine");
    }
    public void price(){
        System.out.println("The price of the Lamborghini Revuelto is: $608,358");
    }
}
