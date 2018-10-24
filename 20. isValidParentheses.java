// https://leetcode.com/problems/valid-parentheses/description/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
