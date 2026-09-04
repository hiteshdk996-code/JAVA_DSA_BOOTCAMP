package DAY12.SESSION1;

import java.util.Scanner;

public class WebGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of web pages:");
        int n=sc.nextInt();
        int links=0;
        System.out.println("Enter the adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sc.nextInt()==1){
                    links++;
                }
            }
        }
           System.out.println("Number of web pages: "+n);
           System.out.println("Number of links: "+links);
    }
}
