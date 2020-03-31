/**
 * O(n)
 * O(n)
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;
        for (int i = 1; i < len; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = len - 1; i >=0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }
}