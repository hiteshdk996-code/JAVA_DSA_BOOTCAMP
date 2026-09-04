package DAY8.HW;

public class TopDownMemoization {
    static int fibonacci(int n, int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fibonacci(n-1, dp)+ fibonacci(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args){
        int n=10;
        int[] dp=new int[n+1];
        System.out.println("Fibonacci:"+fibonacci(n, dp));
    }
}