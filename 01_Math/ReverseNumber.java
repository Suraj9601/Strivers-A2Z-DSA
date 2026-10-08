/*
QUESTION (MEDIUM):- Reverse a number
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

Example 1:
Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.

Example 2:
Input: n = 123
Output: 321
Explanation: Reverse of 123 is 321.
 */

/*
APPROACH :-
1. Initialize a variable `reverse = 0` to store the reversed number.
2. Run a loop until `n` becomes 0.
3. Extract the last digit using `n % 10`.
4. Add the digit to `reverse` using `reverse = reverse * 10 + digit`.
5. Remove the last digit from `n` using `n /= 10`.
6. Return `reverse`.
 */

// TIME COMPLEXITY = O(log n)
// SPACE COMPLEXITY = O(1)

public class ReverseNumber {
    public int reverseNumber(int n) {
        int reverse = 0;

        while(n != 0) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            n /= 10;
        }
        return reverse;
    }
}