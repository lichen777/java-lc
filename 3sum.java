// https://leetcode.com/problems/3sum/description/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3) {
            return results;
        }
        Arrays.sort(nums);
        
        for (int i = 0; i < len - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = 0 - nums[i];
            int start = i + 1;
            int end = len - 1;
            while(start < end){
                if(nums[start] + nums[end] == target) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(nums[i]);
                    result.add(nums[start]);
                    result.add(nums[end]);
                    results.add(result);
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start - 1]){
                        start++;
                    }
                    while(start < end && nums[end] == nums[end + 1]){
                        end--;
                    }
                }else if (nums[start] + nums[end] < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return results;
        
    }
}
