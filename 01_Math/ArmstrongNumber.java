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

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(12));
    }

    public static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;
        int len = 0;

        int temp = n;

        if (n == 0) {
            len = 1;
        } else {
            while (temp != 0) {
                len++;
                temp /= 10;
            }
        }

        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, len);
            temp /= 10;
        }

        return sum == original;
    }
}