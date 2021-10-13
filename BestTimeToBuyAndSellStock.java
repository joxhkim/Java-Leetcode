class Solution {
    public int maxProfit(int[] prices) {
        int minVal = prices[0]; // Set the minimum value to the first element in the array
        int maxProfit = 0; // Set maximum profit made to zero
        for (int i = 0; i < prices.length; i++) { // For each element in the array
            if (prices[i] < minVal) { // Check to see if this element is the smallest element we've seen so far
                minVal = prices[i]; // If so, set it to the new minimum
            }
            else if (prices[i] - minVal > maxProfit) { // If it is not the smallest element we've seen thus far, check to see if selling today is greater than current maxProfit
                maxProfit = prices[i] - minVal; // If so, set maxProfit to today's profit
            }
        }
        return maxProfit; // Return profit.
    }
}
