// https://leetcode.com/problems/group-anagrams/description/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0 || strs == null) {
            return result;
        }
        Map<String, Integer> hash = new HashMap<>();
        int i = 0;
        for (String str : strs) {
            char[] sc = str.toCharArray();
            Arrays.sort(sc);
            String sortedStr = String.valueOf(sc);
            if(!hash.containsKey(sortedStr)) {
                hash.put(sortedStr, i++);
                List<String> sub = new ArrayList<>();
                sub.add(str);
                result.add(sub);
            } else {
                result.get(hash.get(sortedStr)).add(str);
            }
        }
        return result;
    }
}
