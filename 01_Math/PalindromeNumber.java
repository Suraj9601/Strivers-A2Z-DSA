/*
Q.4 (MEDIUM):- Palindrome Number
You are given an integer n. You need to check whether the number is a palindrome number or not.
Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.

Example 1:
Input: n = 121
Output: true
Explanation: When read from left to right : 121.
             When read from right to left : 121.
 */

/*
APPROACH:-
1. Reverse given number
2. Check given number and reversed number
3. If equal return true otherwise false.

TIME COMPLEXITY : O(log n)
SPACE COMPLEXITY : O(1)
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int temp = x;
        int reverse = 0;

        while(x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        if(temp == reverse) {
            return true;
        }
        return false;
    }
}