class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0;
        int maxEnding = 0, minEnding = 0;

        for (int num : nums) {
            maxEnding = Math.max(0, maxEnding + num);  // Kadane for max sum
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(0, minEnding + num);  // Kadane for min sum
            minSum = Math.min(minSum, minEnding);
        }
        
        return Math.max(maxSum, Math.abs(minSum));  // Return max absolute sum
    }
}

