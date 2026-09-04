package DAY10.SESSION2;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
         if(pq.size()> k) {
            pq.poll();
        }
    }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 4;
        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "-th largest element is: " + kthLargest);
    }
}
