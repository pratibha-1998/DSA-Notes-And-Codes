class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int i = 0; // Pointer for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // If a new unique element is found
                i++;
                nums[i] = nums[j]; // Move it to the next position
            }
        }
        return i + 1; // Length of the unique elements
    }
}
