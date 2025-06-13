/*

🔄 Rotate Array by K Steps

Problem: -->  
Given an array, rotate it to the right by `k` steps, where `k` is a non-negative integer.  
Rotation means each element is shifted right and the last element becomes first.

---

🔸 Brute Force Approach (My First Try)
Idea:  
Shift elements one by one, `k` times.

Steps:
1. Run a loop `k` times.
2. In each iteration, move the last element to the front by shifting all others right.

Time complexity: O(k * n)  
Space complexity: O(1)

⚠️ Not efficient for large `k`.

*/

class BruteForceRotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            // Shift elements to the right by one
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}


/*

✅ Optimal Approach → Reverse Technique

Steps:
1. Reverse the entire array
2. Reverse the first k elements
3. Reverse the rest

Time complexity: O(n)  
Space complexity: O(1)

Edge Cases:
- k > n → use k = k % n  
- Empty or single-element → no change

**Example 1**  
Input: [1, 2, 3, 4, 5, 6, 7], k = 3  
Output: [5, 6, 7, 1, 2, 3, 4]

**Example 2**  
Input: [1, 2], k = 3  
Output: [2, 1]

*/

class rotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;

        k = k % n;

        reverse(nums, 0, n - 1);      // 1. Reverse whole array
        reverse(nums, 0, k - 1);      // 2. Reverse first k
        reverse(nums, k, n - 1);      // 3. Reverse remaining
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
