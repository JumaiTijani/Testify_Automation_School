//create a two-dimensional array with 4 rows and 3 columns.
// Fill only the first column with any fruits of ur choice


import java.util.Arrays;

public class JavaTask7 {
    public static void main(String[] args) {
        String [] [] Fruit = new String [4] [3];

        Fruit [0] [0] = "Pawpaw";
        Fruit [1] [0] = "Pineapple";
        Fruit [2] [0] = "Apple";
        Fruit [3] [0] = "Blueberries";


        System.out.println(Arrays.deepToString(Fruit));

    }
}
