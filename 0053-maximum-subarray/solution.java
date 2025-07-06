class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int cs = nums[0];
        int ms = nums[0];

        for(int i=1; i<n; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(cs, ms);
        }
        return ms;
    }
}
