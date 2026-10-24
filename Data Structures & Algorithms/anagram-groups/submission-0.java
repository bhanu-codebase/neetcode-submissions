class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            // creates frequency array
            int[] count = new int[26];
            for(char ch: str.toCharArray()){
                count[ch-'a']++;
            }

            // creating key
            StringBuilder key = new StringBuilder();
            for(int n: count){
                key.append(n).append("#");
            }
            // key == 1#0#1#0#0#0#0........so on

            // retreive already existing list or create new one and adding current string in that
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
