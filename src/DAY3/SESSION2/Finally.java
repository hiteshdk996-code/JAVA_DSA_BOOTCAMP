package DAY3.SESSION2;

public class Finally {
    public static void main(String[] args) {
        try {
            int data = 25 / 25; 
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This block is always executed");
        }
    }
    
}
