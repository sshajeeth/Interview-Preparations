package DataStructure.Challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> groceryList1 = new ArrayList(Arrays.asList("milk", "butter", "cheese"));
        ArrayList<String> groceryList2 = new ArrayList<>(Arrays.asList("Meat", "Fish", "Prawns"));

        groceryList1.add("Yogurd");
        groceryList1.addAll(groceryList2);

        System.out.println(groceryList1);


        if(groceryList1.contains("Meat")){
            groceryList1.remove("Meat");
        }

        System.out.println(groceryList1);
    }
}
