/*

🔁 Reverse an Array

Problem: -->   
You are given an array of integers `arr[]`. Your task is to reverse the given array **in place**.

Approach: -->
- Use two-pointer approach: one from start, one from end.
- Swap elements until both pointers meet.

Time complexity: O(n)  
Space complexity: O(1)

Edge Cases: -->
- Single element → remains unchanged  
- Already reversed → returns same reversed array  
- Empty array → nothing to do

**Example 1**  
Input: [1, 4, 3, 2, 6, 5]  
Output: [5, 6, 2, 3, 4, 1]

**Example 2**  
Input: [4, 5, 2]  
Output: [2, 5, 4]

**Example 3**  
Input: [1]  
Output: [1]

*/

class ReverseArray {

    public void reverseArray(int[] arr) {
        // Edge case: null or empty
        if (arr == null || arr.length <= 1) return;

        int left = 0;
        int right = arr.length - 1;

        // Two-pointer approach to reverse in place
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
