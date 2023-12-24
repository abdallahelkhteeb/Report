
/**
 * approach_1: brute force sol
 * Time complexity O(n ^ 2) time
 * Space O(1)
 
 */
public class approach_1 {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String [] args) {
        int []nums = {2,7,11,15};
        int target = 9;
        int []ans = twoSum(nums, target);
        System.out.println(ans[0] + ' ' + ans[1]);
    }
    
}