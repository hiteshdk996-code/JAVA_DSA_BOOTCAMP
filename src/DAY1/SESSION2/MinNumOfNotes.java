package DAY1.SESSION2;

public class MinNumOfNotes {
    public static void main(String[] args){
        int N=242;
        int C100 = N/100;
        N = N%100;
        int C50 = N/50;
        N = N%50;
        int C20 = N/20;
        N = N%20;
        int C10 = N/10;
        N = N%10;
        int C5 = N/5;
        N = N%5;
        int C2 = N/2;
        N = N%2;
        int C1 = N;
        int result=C100+C50+C20+C10+C5+C2+C1;
        System.out.println("Minimum number of notes required: "+result);
    }
    
}
