import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // 1. Brute Force Approach: O(n^2) time complexity
    public static int[] findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[]{i, j}; // Exits immediately on first match
                }
            }
        }
        return new int[]{}; // Return empty array if no pair found
    }

    // 2. Optimized Approach: O(n) time complexity using HashMap
    public static int[] findTwoSumOptimized(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // If the partner number is already in the map, we found our pair!
            if (map.containsKey(complement)) {
                // map.get(complement) is the older index, i is the current index
                return new int[]{map.get(complement), i}; 
            }

            // Otherwise, save the current number and its index in the map
            map.put(arr[i], i);
        }

        return new int[]{}; // Return empty array if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 6, 1};
        int target = 10;

        // Run Brute Force
        int[] bruteResult = findTwoSum(arr, target);
        System.out.println("Brute Force Result Indices: " + Arrays.toString(bruteResult));

        // Run Optimized
        int[] optimizedResult = findTwoSumOptimized(arr, target);
        System.out.println("Optimized Result Indices:   " + Arrays.toString(optimizedResult));
    }
}
