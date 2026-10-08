/*
Q.7 (EASY):- Check if the Number is Armstrong

You are given an integer n. You need to check whether it is an armstrong number or not.
Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number,
raised to the power of the number of digits.

Example 1:
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

Example 2:
Input: n = 12
Output: false
Explanation: Number of digits : 2.
12 + 22 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.
 */

class Solution {
    public boolean isArmstrong(int n) {
        if (n == 0) return true;
        int sum = 0;
        int temp = n;
        int num = n;
        int len = 0;

        while (temp > 0) {
            temp /= 10;
            len++;
        }

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, len);
        }

        if (sum == num) return true;
        return false;
    }
}