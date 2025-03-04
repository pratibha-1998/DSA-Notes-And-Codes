class Solution {
    public int minSubArraySum(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int n = nums.length;

        // Try every starting index
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Try every ending index
            for (int j = i; j < n; j++) {
                sum += nums[j]; // Sum of subarray nums[i...j]
                minSum = Math.min(minSum, sum); // Update minimum sum
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, -4, 2, -3, -1, 7, -5};
        System.out.println("Minimum Subarray Sum: " + sol.minSubArraySum(nums));
    }
}
