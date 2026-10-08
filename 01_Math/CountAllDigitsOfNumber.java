/*
QUESTION (EASY):-
You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Example 1:
Input: n = 4
Output: 1
Explanation: There is only 1 digit in 4.

Example 2:
Input: n = 14
Output: 2
Explanation: There are 2 digits in 14.
 */

/*
APPROACH:
1. Convert the number to its positive value using Math.abs().
2. If the number is 0, return 1 because 0 has one digit.
3. Repeatedly divide the number by 10.
4. Increment the count after each division.
5. When the number becomes 0, return the count.

 */

// TIME COMPLEXITY = O(log n)
// SPACE COMPLEXITY = O(1)

public class CountAllDigitsOfNumber {
    public int countDigits(int n) {
        n = Math.abs(n);
        int count = 0;

        if (n == 0) return 1;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
