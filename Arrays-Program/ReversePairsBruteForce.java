class ReversePairsBruteForce {
    // Function to count reverse pairs using brute force
    public static int reversePairs(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Check all pairs (i, j) where i < j
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((long) nums[i] > 2L * nums[j]) { // Handle integer overflow
                    count++;
                }
            }
        }

        return count;
    }

    // Driver method to test the function
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        System.out.println("Reverse Pairs Count: " + reversePairs(nums)); // Expected output: 2
    }
}
