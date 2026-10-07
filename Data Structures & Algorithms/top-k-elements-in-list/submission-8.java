class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        // Took 11001 as size cause -1000 can be a possible num and 10000 is the max size of the array
        int[] freq = new int[11001]; 
        int[] ans = new int[k];

        // Adding 1000 so that ArrayIndexOutOfBoundException will not be there
        for(int n: nums){
            freq[n+1000]++;
        }

        int max = 0;
        int index = 0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < 11001; j++){
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