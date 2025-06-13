/*

🥈 Second Largest Element in Array

Problem: -->   
Return the second largest element in the array. If it doesn't exist, return `-1`.

Approach: -->
- One pass to track the largest and second largest.
- Skip duplicates of the max.

Time complexity: O(n)  
Space complexity: O(1)

Edge Cases: -->
- All elements same → return `-1`  
- Only two elements → returns smaller if distinct

**Example 1**  
Input: `[12, 35, 1, 10, 34, 1]`  
Output: `34`

**Example 2**  
Input: `[10, 10, 10]`  
Output: `-1` 

*/

class secondLargest {

    public int getSecondLargest(int[] arr) {
        // Edge case: if array is null or has less than 2 elements
        if (arr == null || arr.length < 2) return -1;

        int max = Integer.MIN_VALUE; // To store the largest element
        int sec = Integer.MIN_VALUE; // To store the second largest element

        // Traverse the array to find the largest and second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // Update both max and sec if current element is new max
                sec = max;
                max = arr[i];
            } else if (arr[i] > sec && arr[i] != max) {
                // Update sec if current element is between max and sec, and not equal to max
                sec = arr[i];
            }
        }
        // If sec was never updated, return -1 (no second largest)
        return (sec == Integer.MIN_VALUE) ? -1 : sec;
    }
}
