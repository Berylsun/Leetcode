//n^3, n^2
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                //j > i + 1!!! or [0, 0, 0, 0] 0 => []
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int sum = target - nums[i] - nums[j];
                int l = j + 1;
                int r = nums.length - 1;
                
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    }else if (nums[l] + nums[r] > sum) {
                        r--;
                    }else {
                        l++;
                    }
                }
            }
        }
        
        return res;
    }
}
