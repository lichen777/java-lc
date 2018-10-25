// https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return nums[0];
        }
        int sum = 0;
        int maxSum = -Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(sum, maxSum);
            
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}

// https://leetcode.com/problems/maximum-subarray/discuss/20193/DP-solution-and-some-thoughts
