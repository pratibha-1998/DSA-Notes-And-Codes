class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the last n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            // Swap elements
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}


Time Complexity 0(n)
  space Complexity 0(1)
