// https://leetcode.com/problems/count-and-say/description/

class Solution {
    public String countAndSay(int n) {
        String preString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char[] preChars = preString.toCharArray();
            int count = 1;
            int len = preChars.length;
            for(int i = 1; i < len; i++) {
                if(preChars[i-1] == preChars[i]){
                    count++;
                }else {
                    sb.append(count).append(preChars[i-1]);
                    count = 1;
                }
            }
            preString = sb.append(count).append(preChars[len-1]).toString();
        }
        return preString;
    }
}
