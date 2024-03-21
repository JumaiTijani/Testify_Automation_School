//Create 3 different constructors of a class A.
//Create 3 objects of Class A in class B and
//use the 3 different constructors when creating each of the objects of class A in class B


package JavaTask13;

public class ClassA {
    String name;
    String model;
    boolean Electric;

    public ClassA(String carName) {
        name = carName;
    }

    public ClassA(String carName, String carModel) {
        model = carModel;
    }

    public ClassA(String carName, String carModel, boolean electricCar) {
        Electric = electricCar;
    }
}
