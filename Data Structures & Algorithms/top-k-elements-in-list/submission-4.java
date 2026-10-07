class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[20001];
        int[] ans = new int[k];

        for(int n: nums){
            freq[n+1000]++;
        }

        int max = 0;
        int index = 0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < freq.length; j++){
                if(freq[j] > max){
                    max = freq[j];
                    index = j;
                }
            }

            ans[i] = index-1000;
            freq[index] = 0;
            index = 0;
            max = 0;
        }

        return ans;

    }
}