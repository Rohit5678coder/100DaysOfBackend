import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Total fruits: " + fruits.size());

        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}