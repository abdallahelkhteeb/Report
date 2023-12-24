/*
 * approach 3 using hash table
 * time complexity O(n);
 * space complexity O(n);
 */

 import java.util.HashMap;
 import java.util.Map;
 import java.util.Arrays;
public class approach_3 {
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices of the two numbers: " + Arrays.toString(result));
    }
    
    
}