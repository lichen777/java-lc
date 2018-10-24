// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
        	if(map.containsKey(s.charAt(i))) {
        		start = Math.max(start, map.get(s.charAt(i)) + 1);
        	}
        	map.put(s.charAt(i), i);
        	result = Math.max(result, i - start + 1);
        }
        return result;
    }
}
