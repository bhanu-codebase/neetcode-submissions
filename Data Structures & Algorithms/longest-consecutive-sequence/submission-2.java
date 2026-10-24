class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        // int ans[] = new int[set.size()];
        // for(int i = 0; i < set.size(); i++){
        //     ans[i] = set.remove();
        // }
        int ans[] = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(ans);
        int count = 1, maxCount = count;
        for(int i = 0; i < ans.length-1; i++){ 
            if(ans[i+1] == ans[i]+1){
                count++;
            }else{
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
// 2 20 4 10 3 4 5 
// 2 20 4 10 3 5 
// 2 3 4 5 10 20