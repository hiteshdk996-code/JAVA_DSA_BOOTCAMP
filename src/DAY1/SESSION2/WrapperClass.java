package DAY1.SESSION2;

public class WrapperClass { 
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a); // Boxing
        int b = i.intValue(); // Unboxing
        System.out.println("Value of a: " + a);
        System.out.println("Value of i: " + i);
        System.out.println("Value of b: " + b);
    }
    
}
