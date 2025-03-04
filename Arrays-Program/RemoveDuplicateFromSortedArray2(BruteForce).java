import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateAtMostTwice {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 3};

        int result = removeDuplicates(nums);
        System.out.println("New Length: " + result);

        // Print modified array (First k elements)
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> tempList = new ArrayList<>(); // Temporary storage
        int n = nums.length;
        boolean[] visited = new boolean[n]; // Track counted elements

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; // Skip if already counted

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true; // Mark as counted
                }
            }

            // Only add elements if they appear at most twice
            if (count <= 2) {
                for (int k = 0; k < count; k++) {
                    tempList.add(nums[i]);
                }
            }
        }

        // Copy back the result to nums array
        for (int i = 0; i < tempList.size(); i++) {
            nums[i] = tempList.get(i);
        }

        return tempList.size();
    }
}
