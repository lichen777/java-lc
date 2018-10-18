// https://leetcode.com/problems/first-missing-positive/description/

class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        
        int len = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[i] != (i+1)) {
                int tmp = nums[nums[i]-1];
                if (tmp == nums[i]) {
                    break;
                }
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}
