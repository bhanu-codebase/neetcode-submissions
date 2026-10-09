class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length];
        // product of left
        int product = 1;
        for(int i = 0; i < nums.length; i++){ 
            left[i] = product;
            product*=nums[i];
        }

        // product of right
        product = 1;
        for(int i = nums.length-1; i >= 0; i--){ 
            right[i] = product; 
            product*=nums[i]; 
        }

        // product
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}  
// 1 2 4 6
// 1 1 2 8 left seedha loop
// 48 24 6 1 right reverse loop