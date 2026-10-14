/*
Q.8 (EASY) :- Check for Perfect Number
You are given an integer n. You need to check if the number is a perfect number or not.
Return true if it is a perfect number, otherwise, return false.
A perfect number is a number whose proper divisors (excluding the number itself)
add up to the number itself.

Example 1:
Input: n = 6
Output: true
Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6.
 */

/*
APPROACH :-
1. Declare variable sum to store sum of divisors
2. Iterate loop up to square root of n
3. Find divisor and add in sum
4. Find another equivalent divisor using n/i (i is divisor)
5. Return true if sum is equal to n otherwise retuen false
 */

// TIME COMPLEXITY :- O(sqrt(n)
// SPACE COMPLEXITY :- O(1)

class PerfectNumber {
    public boolean isPerfect(int n) {
        if(n <= 1) return false;

        int sum = 1;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                sum += i;

                if(n/i != n) {
                    sum += n/i;
                }
            }
        }
        return sum == n;
    }
}