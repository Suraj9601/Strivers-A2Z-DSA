/*
Q.2 (EASY):- Count odd digits in a number
You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Example 1:
Input: n = 541
Output: 2
Explanation: 5 and 1 is an odd digits.
 */

/*
APPROACH:-
1. Declare count variable to store count
2. Iterate number until number is equal than 0
3. Access last digit of number using num % 10
4. Cheak digit is odd if odd then increament count by 1
5.
 */

// TIME COMPLEXITY = O(log n)
// SPACE COMPLEXITY = O(1)

public class CountOddDigitsInNumber {
    public int countOddDigit(int num) {
        int count = 0;

        while (num > 0) {
            int d = num % 10;
            if(d % 2 != 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}