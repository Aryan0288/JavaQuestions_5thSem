package Questons;
import java.util.Arrays;
import java.util.PriorityQueue;

public class LexicographicallySmallestArray {

    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] result = new int[n];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(nums[a], nums[b]));

        for (int i = 0; i < n; i++) {
            minHeap.offer(i);
        }

        for (int i = 0; i < n; i++) {
            int minIndex = minHeap.poll();
            result[i] = nums[minIndex];

            // Update adjacent elements in the heap
            if (i < n - 1) {
                int diff = Math.abs(nums[minIndex] - nums[i + 1]);
                if (diff <= limit) {
                    minHeap.offer(i + 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 28, 19, 10};
        int limit = 3;

        int[] result = lexicographicallySmallestArray(nums, limit);

        System.out.println(Arrays.toString(result));
    }
}
