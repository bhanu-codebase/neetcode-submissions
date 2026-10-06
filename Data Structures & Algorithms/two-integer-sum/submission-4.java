class Solution {
    public int[] twoSum(int[] nums, int target) {       
        int left = 0;
        int right = left + 1;
        while (left < nums.length) {
            if (right == nums.length) {
                left++;
                right = left + 1;
            }
            if (nums[left] + nums[right] == target) {
                return new int[] { left, right };
            }
            right++;
        }

        return new int[] { -1, -1 };
    }
}
