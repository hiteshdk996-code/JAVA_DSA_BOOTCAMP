package DAY5.SESSION1;

public class Leetcode1011 {
    
    static int shipWithinDays(int[] weights, int days) {

        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int day = 1, sum = 0;

            for (int w : weights) {
                if (sum + w > mid) {
                    day++;
                    sum = 0;
                }
                sum += w;
            }

            if (day <= days)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum Ship Capacity: " + result);
    }
}

