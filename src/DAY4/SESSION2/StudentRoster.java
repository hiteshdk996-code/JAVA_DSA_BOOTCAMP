package DAY4.SESSION2;

import java.util.ArrayList;

public class StudentRoster {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Chandan");
        students.add("Rahul");
        students.add("Arun");
        students.add("Priya");
        
        System.out.println("Student Roster:");
        for (String student : students) {
            System.out.println(student);
        }

        students.add(2, "Kiran");

        System.out.println("\nAfter adding Kiran:");
        System.out.println(students);

        
        students.remove("Rahul");

        System.out.println("\nAfter removing Rahul:");
        System.out.println(students);

        
        if (students.contains("Chandan")) {
            System.out.println("\nChandan is present in the roster.");
        }
         System.out.println("Total Students: " + students.size());
    }
}