package DAY2.SESSION1;

public class climbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {

        try (java.util.Scanner in = new java.util.Scanner(System.in)) {
            System.out.println("Enter the Number of stairs:");

            int n = in.nextInt();

            System.out.println("The combinations: " + climbStairs(n));
        }

    }
        
    
}

