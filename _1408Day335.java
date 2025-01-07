
// 1408. String Matching in an Array
// https://leetcode.com/problems/string-matching-in-an-array


import  java.util.ArrayList;
import  java.util.List;

class _1408Day334 {
    public List<String> stringMatching(String[] words) {
        
        List<String> matchedStrings = new ArrayList<>();
        int numberOfWords = words.length;

        for (int i = 0; i < numberOfWords; ++i) {
            for (int j = 0; j < numberOfWords; ++j) {
                if (i != j && words[j].contains(words[i])) {
                    matchedStrings.add(words[i]);
                    break; 
                }
            }
        }
        return matchedStrings;
    }
}