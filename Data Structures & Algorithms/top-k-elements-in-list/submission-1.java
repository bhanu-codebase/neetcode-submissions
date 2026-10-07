class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        if( nums.length == 0 || nums.length < k){
            return new int [0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] result = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return result;

    }
}