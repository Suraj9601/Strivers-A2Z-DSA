/*
QUESTION (EASY):-
Given an array A[] of size n. The task is to find the largest element in it.

Example:
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output: 90
Explanation: The largest element of given array is 90
*/

/*
APPROACH:-
1. Intialize the ans with starting element
2. Traverse the entire array and update the ans if the element is greater then ans
3. Finally, return the ans
*/

// TIME COMPLEXITY = O(n)
// SPACE COMPLEXITY = O(1)

public class LargestElementInArray {
    public int largestElementInArray(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for(int i : arr) {
            if(i > largest) {
                largest = i;
            }
        }
        return largest;
    }
}

