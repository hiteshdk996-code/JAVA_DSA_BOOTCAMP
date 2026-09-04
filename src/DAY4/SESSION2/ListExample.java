package DAY4.SESSION2;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // Creating a List
        List<String> names = new ArrayList<>();

        // Adding elements
        names.add("Chandan");
        names.add("Rahul");
        names.add("Kiran");
        names.add("Arun");

        // Display List
        System.out.println("Names: " + names);

        // Accessing element
        System.out.println("First name: " + names.get(0));

        // Removing element
        names.remove("Rahul");

        // Display after removal
        System.out.println("After removal: " + names);

        // Size of List
        System.out.println("Size: " + names.size());

        // Checking element
        System.out.println("Contains Kiran: " + names.contains("Kiran"));
    }
}