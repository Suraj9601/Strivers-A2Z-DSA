/*
QUESTION (EASY):-
Given an array arr of size n, the task is to find the sum of all the elements in the array.

Example 1:
Input: n=5, arr = [1,2,3,4,5]
Output: 15

Explanation: Sum of all the elements is 1+2+3+4+5 = 15
 */

/*
APPROACH :-
1. Declare sum variable to store sum of element
2. Traverse whole array and add one by one element in sum variable
3. Return sum
 */

// TIME COMPLEXITY = O(n)
// SPACE COMPLEXITY = O(1)

public class SumOfArrayElements {
    public int sumOfArrayElements(int[] arr) {
        int sum = 0;

        for(int i : arr) {
            sum += i;
        }
        return sum;
    }
}