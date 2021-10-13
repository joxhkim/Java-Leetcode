class Solution {
    public int singleNumber(int[] nums) {
        // Creating a new Hashmap where key = element & value = frequency
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int num : nums) { // Enhanced for loop: For each number in nums array..
            if (hashmap.containsKey(num)) { // If the element already exists in the hashmap,
                hashmap.put(num, hashmap.get(num)+1); // ..increment the count by 1.
            }
            else { // Otherwise, 
                hashmap.put(num, 1); // Put it in the hashmap and record the value (frequency) as 1.
            }
        }
        for (int num : nums) { // Second loop to retrieve counts
            if (hashmap.get(num)==1) { // If the count is 1, we return.
                return num;
            }
        }
        return 0;
    }
}

/* int singleNumber(int[] nums) {  
    int result = 0;
    for (int i = 0; i < nums.length; i++)
    {
		result ^= nums[i];
    }
	return result;
}

Clever solution by Ivantsang to return when an element is seen only once in an array using XOR operator. A XOR A = 0.
