package DAY1.SESSION3;

public class Unboxing {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(20); // Boxing
        int a = i.intValue(); // Unboxing
        System.out.println("Object of i: " + i);
        System.out.println("Primitive of a: " + a);
    }
    
}
