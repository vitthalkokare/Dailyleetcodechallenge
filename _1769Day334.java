// 1769. Minimum Number of Operations to Move All Balls to Each Box
// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/

import java.util.Arrays;

public class _1769Day334 {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        // First pass: Calculate moves from left to right
        int countLeft = 0; // Count of balls to the left
        int movesLeft = 0; // Total moves needed for left side
        for (int i = 0; i < n; i++) {
            answer[i] += movesLeft; // Add total moves needed so far
            if (boxes.charAt(i) == '1') {
                countLeft++; // Increment if a ball is found
            }
            movesLeft += countLeft; // Update total moves needed for next box
        }

        // Second pass: Calculate moves from right to left
        int countRight = 0; // Count of balls to the right
        int movesRight = 0; // Total moves needed for right side
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += movesRight; // Add total moves needed so far
            if (boxes.charAt(i) == '1') {
                countRight++; // Increment if a ball is found
            }
            movesRight += countRight; // Update total moves needed for next box
        }

        return answer;
    }

    public static void main(String[] args) {
        _1769Day334 solution = new _1769Day334();
        
        String boxes1 = "110";
        int[] result1 = solution.minOperations(boxes1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 1, 3]

        String boxes2 = "001011";
        int[] result2 = solution.minOperations(boxes2);
        System.out.println(Arrays.toString(result2)); // Output: [11, 8, 5, 4, 3, 4]
    }
}
