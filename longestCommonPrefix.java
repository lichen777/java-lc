// https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int len = strs.length;
        Arrays.sort(strs);
        if(len < 2){
            return strs[0];
        }
        String common = "";
        for (int i = 0; i < strs[0].length(); i++){
            for (int j = 0; j < len; j++){
                if (strs[0].charAt(i) != strs[j].charAt(i)){
                    return common;
                }
            }
            common += strs[0].charAt(i);
        }
        return common;
    }
}
