// https://leetcode.com/problems/longest-palindromic-substring/description/

class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int length = s.length();
        
        if(length == 0 || s == null) {
        	return result;
        }
        if(length == 1) {
        	return s;
        }
        
        int start = 0, end = 0;
        int max = 1;
        for(int i = 0; i < length - 1; i++) {
        	int len = 0;
        	String cur = "";
        	if(s.charAt(i) == s.charAt(i + 1)) {
        		start = i - 1;
        		end = i + 2;
        		while (end < length && s.charAt(end - 1) == s.charAt(end)) {
        			end++;
        		}
        	} else {
        		start = i - 1;
        		end = i + 1;
        	}
        	
        	while (start >= 0 && end < length && s.charAt(start) == s.charAt(end)) {
        		start--;
        		end++;
        	}
        	len = end - start - 1;
        	cur = s.substring(start + 1, end);
        	if (max <= len) {
        		result = cur;
        		max = len;
        	}
        }
        return result;
    }
}
