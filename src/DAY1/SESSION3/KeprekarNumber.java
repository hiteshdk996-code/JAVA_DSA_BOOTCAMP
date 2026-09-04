package DAY1.SESSION3;

public class KeprekarNumber{
    public static void main (String[] args) {
    int n = 20;
    int square = n * n;
    String str = String.valueOf(square);
    int len = str.length();

    for(int i =1; i<len; i++){
        String leftPart = str.substring(0, i);
        String rightPart = str.substring(i);
        int left = Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);

        if(left + right == n){
            System.out.println(n + " is a Kaprekar number.");
            break;
        }
    }

    }
}