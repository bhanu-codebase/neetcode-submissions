class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[20001];
        int[] ans = new int[k];

        for(int n: nums){
            freq[n+10000]++;
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

            ans[i] = index-10000;
            freq[index] = 0;
            index = 0;
            max = 0;
        }

        return ans;

    }
}
// 1 1 1 1 2 2 2 3 3 3 3 3 3 4 4 4 4
// 0 4 3 6 4 

// 1 2 3 4 5 6 7 8 9 5 6 2 3 1 4 5 ..... 10000