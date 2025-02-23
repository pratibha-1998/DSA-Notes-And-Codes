First Missing Positive(Hard)
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

  /*below is code*/

  /********************************** code start *******************************/ 

  class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Cyclic Sort: Place each number in its correct index if in range [1, n]
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++; // Move forward if swap not needed
            }
        }

        // Find first missing positive
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) return j + 1;
        }

        return n + 1; // If all numbers 1 to n are present, return next number
    }
}

/********************************** code end *******************************/ 


/* all important short notes */



1️⃣ Key Idea
The smallest missing positive number must be within the range [1, n+1], where n is the array size.
Ignore numbers ≤ 0 or > n since they do not contribute to the missing number.
Use cyclic sort to place numbers in their correct indices.
2️⃣ Cyclic Sort Algorithm
Iterate through the array and swap each number to its correct position if:
nums[i] is in the range [1, n]
nums[i] != nums[correctIndex] (avoid duplicate swaps).
After sorting, traverse the array to find the first missing number.
3️⃣ Edge Cases to Handle
✅ All numbers > n → return 1
✅ All numbers are correctly placed → return n+1
✅ Unsorted input with duplicates & negatives → Ignore <= 0 and > n

5️⃣ Time & Space Complexity
Time Complexity: O(n) (Each element is swapped at most once).
Space Complexity: O(1) (In-place sorting).
6️⃣ Example Runs
Input	Sorted Array	Output
[3, 4, -1, 1]	[1, -1, 3, 4]	2
[7, 8, 9, 11, 12]	[7, 8, 9, 11, 12]	1.....ignore all no greater than n return 1;
[1, 2, 3, 4, 5]	[1, 2, 3, 4, 5]	6
🔹 Final Takeaway
Ignore negatives & large numbers (<= 0 or > n)
Use cyclic sort to position numbers correctly
Find the first index where nums[j] != j+1
Edge Case: If all are correct, return n+1
🚀 Most efficient O(n) approach for finding the first missing positive!


  ✅ Ignore negative numbers and large numbers (<= 0 or > n)
✅ Use cyclic sort to position numbers correctly
✅ Find the first index where nums[j] != j+1
✅ Edge Case: If all are correct, return n+1
✅ Most efficient O(n) approach for finding the first missing positive!


  Code Optimization (Avoid Extra Swap Variable):

Instead of:
java
Copy
Edit
int temp = nums[i];
nums[i] = nums[correctIndex];
nums[correctIndex] = temp;
You can use:
java
Copy
Edit
nums[i] ^= nums[correctIndex];
nums[correctIndex] ^= nums[i];
nums[i] ^= nums[correctIndex];
This removes the need for a temporary variable and improves efficiency.



