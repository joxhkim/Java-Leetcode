class Solution {
    public int[] twoSum(int[] nums, int target) { 
        Map<Integer, Integer> coll = new HashMap<Integer, Integer>(); // Implementation of Hashmap for O(N) lookup and retrieval time.
        for (int i = 0; i < nums.length; i++) { // Iterate through the entire given aray
            int complement = target - nums[i]; // Instantiating var complement to simplify code
                if (coll.containsKey(complement)) { // If our hashmap contains the complement...
                    return new int[] {coll.get(complement), i}; // Return a new int array with the indicies of complement and current element
            }
            coll.put(nums[i], i); // Otherwise, keep adding values into collection until we find a match. Adding ith element along with its index.
        }
        throw new IllegalArgumentException(); // Error handling
    }
}
