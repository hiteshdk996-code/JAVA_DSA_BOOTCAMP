package DAY10.SESSION3;

import java.util.Scanner;
import java.util.Arrays;

public class SortTheStrings {
    
    public static String sortCharacters(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(sortCharacters(str));
    }
}
