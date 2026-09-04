package DAY9.SESSION2;

import java.util.*;

public class QueueStack {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int k = 3;

        for (int num : arr) {
            queue.add(num);
        }

        System.out.println("Queue: " + queue);

       
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        System.out.println("Queue after removing K values: " + queue);
        System.out.println("Stack: " + stack);
    }
}