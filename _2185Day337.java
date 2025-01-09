// 2185. Counting Words With a Given Prefix
// https://leetcode.com/problems/counting-words-with-a-given-prefix

public class Solution {
    public static int countWordsWithPrefix(String[] words, String pref) {
        int count = 0;
        
        // Loop through each word in the array
        for (String word : words) {
            // Check if the word starts with the given prefix
            if (word.startsWith(pref)) {
                count++; // Increment count if it does
            }
        }
        
        return count; // Return the total count
    }

    public static void main(String[] args) {
        // Example 1
        String[] words1 = {"pay", "attention", "practice", "attend"};
        String pref1 = "at";
        System.out.println(countWordsWithPrefix(words1, pref1)); // Output: 2

        // Example 2
        String[] words2 = {"leetcode", "win", "loops", "success"};
        String pref2 = "code";
        System.out.println(countWordsWithPrefix(words2, pref2)); // Output: 0
    }
}
