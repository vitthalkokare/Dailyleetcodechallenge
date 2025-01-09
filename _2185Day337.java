// 2185. Counting Words With a Given Prefix
// https://leetcode.com/problems/counting-words-with-a-given-prefix

class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;
        
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++; // Increment count if it does
            }
        }
        
        return count; // Return the total count
        
    }
}
