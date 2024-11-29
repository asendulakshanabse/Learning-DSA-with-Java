package ArrayDir;
import java.util.ArrayList;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements
        System.out.println("First element: " + names.get(0)); // Output: Alice

        // Modifying elements
        names.set(1, "Bobby"); // Changes "Bob" to "Bobby"

        // Removing elements
        names.remove(2); // Removes "Charlie"

        // Size of the ArrayList
        System.out.println("Size: " + names.size()); // Output: 2

        // Iterating over elements
        for (String name : names) {
            System.out.println(name);
        }
    }

}
