// https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] height) {
        if( height == null || height.length < 2 ) {
            return 0;
        }
        int left = 0; 
        int right = height.length - 1;
        int max = 0;
        int h = 0;
        while ( left < right ) {
            h = Math.min (height[left], height[right]);
            max = Math.max (max, (right - left) * h);
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}
