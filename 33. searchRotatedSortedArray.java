// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) {
            return -1;
        }
        if(len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int mid;
        int start = 0, end = len - 1;
        
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            if (nums[start] < nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        if (target == nums[start]) {
            return start;
        }
        if (target == nums[end]){
            return end;
        }
        return -1;
    }
}
