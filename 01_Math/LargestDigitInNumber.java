/*
Q.5 (EASY):- Largest digit in a number
You are given an integer n. Return the largest digit present in the number.

Example 1:
Input: n = 25
Output: 5
Explanation: The largest digit in 25 is 5.
 */

// TIME COMPLEXITY : O(log n)
// SPACE COMPLEXITY : O(1)

public class LargestDigitInNumber {
    public static int largestDigit(int n) {
        int largestDigit = Integer.MIN_VALUE;
        n = Math.abs(n);

        if (n == 0) return 0;

        while (n > 0) {
            int d = n % 10;
            if (d > largestDigit) {
                largestDigit = d;
            }
            n /= 10;
        }
        return largestDigit;
    }
}