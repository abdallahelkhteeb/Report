/*
 * approach_2 : using binary Search algorithm.
 * Time complexity = O(n log(n))
 * Memory comlexity = O(n).
 * 
 */

 import java.util.Arrays;

import javafx.util.Pair;
public class approach_2 {
    public  int[] twoSum(int[] nums, int target) {
        Pair<Integer, Integer> sorted_array[] = new Pair[nums.length];
        for(int i = 0; i < nums.length; ++i) {
           sorted_array[i] = Pair.of(nums[i], i);
        }
        Arrays.sort(sorted_array, Comparator.comparingInt(Pair::getKey));
        
        for(int i = 0; i < nums.length; ++i) {
        
            int idx = binary_search(sorted_array, i + 1, target - sorted_array[i].getKey());
        
            if(idx != -1) {
                return new int[] {idx, sorted_array[i].getValue()};
            }
        
        }
        return new int[] {-1, -1};
    }
    

    private int binary_search(Pair<Integer, Integer> sorted_array[], int start ,int target) {
        
        int end = sorted_array.length - 1;
        
        while(end >= start) {
            int mid = start+ (end - start) / 2;
            if(sorted_array[mid].getKey() == target)
                return sorted_array[mid].getValue();
            else if(sorted_array[mid].getKey() > target)
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return -1;
    }
}