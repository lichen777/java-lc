// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

class Solution {
    private static String[] phone = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    private void helper(List<String> list, String digits, String ans){
        if(digits.length() == ans.length()){
            list.add(ans);
            return;
        }
        for(char c : phone[digits.charAt(ans.length()) - '2'].toCharArray()){
            helper(list, digits, ans + c);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        helper(result, digits, "");
        return result;
    }
}
