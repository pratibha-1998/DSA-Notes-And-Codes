class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If 2 or fewer elements, return as is
        
        int index = 2; // Start from the 3rd position (allow at most 2 occurrences)

        // Loop from the 3rd element onwards
        for (int i = 2; i < nums.length; i++) {
            // Check if the current number is different from the number two positions before it
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i]; // Place it at the correct position
                index++; // Move forward
            }
        }

        return index; // New length of the array
    }
}
