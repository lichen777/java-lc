// https://leetcode.com/problems/generate-parentheses/description/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
        	return result;
        }
        helper(result, "", n, n);
        return result;
    }
    private void helper(List<String> result, String str, int nLeft, int nRight) {
    	if (nLeft == 0 && nRight == 0) {
    		result.add(str);
    		return;
    	}
    	if (nLeft > 0) {
    		helper(result, str + '(', nLeft - 1, nRight);
    	}
    	if (nRight > nLeft) {
    		helper(result, str + ')', nLeft, nRight - 1);
    	}
    }
}
