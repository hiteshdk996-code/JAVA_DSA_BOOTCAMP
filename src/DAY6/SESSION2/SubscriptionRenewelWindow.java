package DAY6.SESSION2;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionRenewelWindow {

    public static int longestWindow(List<Integer> days, int k){
        int left=0;
        int maxLength=0;
        for(int right=0;right<days.size();right++) {
            if(days.get(right)-days.get(left)>k){
                
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] days={1,3,5,7,9};
        List<Integer> dayList = new ArrayList<>();
        for (int day : days) {
            dayList.add(day);
        }
        System.out.println(longestWindow(dayList, 2));
    }
    
}
