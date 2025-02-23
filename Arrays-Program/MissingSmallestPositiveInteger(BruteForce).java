Brute Force Approach - Smallest Missing Positive Number
Key Idea
Check for each number from 1 to n if it exists in the array.
The first missing number is the answer.
Algorithm
Loop from smallest = 1 to n (array size).
For each smallest, scan the array to check if it exists.
If smallest is not found, return it immediately.
If all numbers are found, return n + 1.
Time Complexity
O(n²) in the worst case (nested loop).
Edge Cases to Handle
✅ If the array contains all numbers from 1 to n, return n+1.
✅ If the array contains only large numbers (e.g., [10, 9, 7, 5]), return 1.

Example Execution
Input: arr = [10, 9, 7, 5]
Steps:
smallest = 1 → Not found → ✅ Return 1
Stops early (does not check further).
✅ Final Output: 1

This brute force approach is simple but inefficient.

  /*******************************code start ************************************/
  public class MissingNumberBruteForce {
    public static int findSmallestMissing(int[] arr) {
        int n = arr.length;

        // Check for each number from 1 to n
        for (int smallest = 1; smallest <= n; smallest++) {
            boolean found = false;

            // Scan the entire array to check if 'smallest' exists
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == smallest) {
                    found = true;
                    break; // Stop searching once found
                }
            }

            // If 'smallest' is not found, return it
            if (!found) {
                return smallest;
            }
        }

        // If all numbers from 1 to n are present, return n+1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 5}; // Example input
        System.out.println("Smallest missing positive number: " + findSmallestMissing(arr));
    }
}
/**************************************code end *****************************************/
