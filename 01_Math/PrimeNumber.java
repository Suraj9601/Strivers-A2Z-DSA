/*
Q. 9 (EASY):- Check for Prime Number
You are given an integer n. You need to check if the number is prime or not.
Return true if it is a prime number, otherwise return false.
A prime number is a number which has no divisors except 1 and itself.

Example 1:
Input: n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

Example 2:
Input: n = 8
Output: false
Explanation: The divisors of 8 are 1, 2, 4, 8, thus it is not a prime number.
 */

/*
APPROACH:-
1. Check number is less than or equal to 1, if yes return false
2. Iterate loop up to square root of n using n / i;
3. Check number is divisible by i, if yes return false
4. otherwise return true
 */

// TIME COMPLEXITY : O(sqrt(n))
// SPACE COMPLEXITY : O(1)

class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}