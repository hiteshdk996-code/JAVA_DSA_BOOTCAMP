package DAY10.SESSION2;

import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicQueue {
    public static void main(String[] args) {
        int[] arr ={3, 1, 5, 2, 4};
        Deque<Integer> queue = new ArrayDeque<>();
        for (int num : arr) {
            while (!queue.isEmpty() && queue.peekLast() < num) {
                queue.pollLast();
            }
            queue.offerLast(num);
        }
        System.out.println(queue);
    }
}
