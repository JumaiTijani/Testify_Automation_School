//OVERRIDING: Create two methods in a parent class with arguments.
//Write a print statement in the method body,
//Override the 2 methods in the child class and write a different print statement in the body of the overriding method


package JavaTask16B;

public class ChildClass extends ParentClass{
    public static void main(String[] args) {
        ChildClass mabel = new ChildClass();
        mabel.driveFastCars("Bugatti", 2);
        mabel.playBoardGames("Chess", true);

    }
    public void playBoardGames(String type, boolean condition){
        System.out.println("mabel is a Chess champion");
    }
    public void driveFastCars(String type, int number){
        System.out.println("mabel drives two fast cars");
    }
}
