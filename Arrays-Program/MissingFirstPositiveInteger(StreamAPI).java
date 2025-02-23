/*****************************code start******************************/
public class MissingNumberStreamAPI {
    public static int findSmallestMissing(int[] arr) {
        // Convert array to a Set to allow O(1) lookups
        Set<Integer> numSet = Arrays.stream(arr)
                                    .boxed()
                                    .collect(Collectors.toSet());

        // Iterate from 1 to n+1 and return the first missing number
        return Arrays.stream(new int[arr.length + 1])
                     .map(i -> i + 1) // Generate numbers from 1 to n+1
                     .filter(i -> !numSet.contains(i)) // Find the first missing number
                     .findFirst()
                     .orElse(arr.length + 1); // If all present, return n+1
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1}; // Example input
        System.out.println("Smallest missing positive number: " + findSmallestMissing(arr));
    }
}
/********************************code end****************************************/
How This Works
✅ Uses Streams API to convert the array into a Set<Integer> for O(1) lookups.
✅ Generates a stream of numbers from 1 to n+1 and filters out those present in the set.
✅ Returns the first missing number using findFirst().
✅ Time Complexity: O(n) (set creation + stream filtering).
✅ Space Complexity: O(n) (for storing numbers in a set).
