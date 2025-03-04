import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        int index = 0; // This will track the position in the modified array
        
        for (int i = 0; i < nums.length; i++) {
            if (!uniqueElements.contains(nums[i])) { // If not already in HashSet
                uniqueElements.add(nums[i]); // Add to HashSet
                nums[index] = nums[i]; // Place unique element in array
                index++; // Move index forward
            }
        }
        return index; // New length of the modified array
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = sol.removeDuplicates(nums);
        
        System.out.println("New Length: " + newLength);
        
        // Print modified array (only first 'newLength' elements are relevant)
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
