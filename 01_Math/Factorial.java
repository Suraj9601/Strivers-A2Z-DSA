/*
Q.6 (EASY):- Factorial of a number
You are given an integer n. Return the value of n! or n factorial.
Factorial of a number is the product of all positive integers less than or equal to that number.

Example 1:
Input: n = 2
Output: 2
Explanation: 2! = 1 * 2 = 2.

Example 2:
Input: n = 0
Output: 1
Explanation: 0! is defined as 1.
 */

// TIME COMPLEXITY : O(n)
// SPACE COMPLEXITY : O(1)

public class Factorial {
    public int factorial(int n) {
        if(n == 0) return 1;

        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}