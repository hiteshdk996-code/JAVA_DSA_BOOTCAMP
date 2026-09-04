package DAY4.SESSION2;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.PriorityQueue<>();
        q.offer(10);
        q.offer(20);
        q.offer(15);
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
