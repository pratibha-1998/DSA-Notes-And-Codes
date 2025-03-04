class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        int[] temp = new int[k];

        // Step 1: Store the last k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i]; // Copy last k elements
        }

        // Step 2: Shift the first (n-k) elements to the right
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k]; // Move elements by k positions
        }

        // Step 3: Copy the stored k elements from temp back to nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
