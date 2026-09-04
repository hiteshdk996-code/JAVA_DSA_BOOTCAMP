package DAY10.SESSION1;

import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums) {
        return nextGreatInt(nums);
    }
    public static int[] nextGreatInt(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int index = stack.pop();
                result[index] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = nextGreaterElement(nums);
        System.out.println(Arrays.toString(result));
    }
}
