class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        // count t frequencies
        for(char ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0;
        String ans = "";
        int have = 0, need = map.size();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // looping over s
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // character frequency satisfied
            if(map.containsKey(ch) && window.get(ch).intValue() == map.get(ch).intValue()){
                have++;
            }

            // window is valid
            while(have == need){
                int windowLen = r-left+1;
                if(windowLen < minLen){
                   minLen = windowLen;
                   start = left;
                }

                // remove left character
                char leftChar = s.charAt(left);

                window.put(leftChar, window.getOrDefault(leftChar, 0)-1);

                // window becomes invalid
                if(map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)){
                    have--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE
        ? ""
        : s.substring(start, start+minLen);
    }
}
// ouzodyxazv
// l

// x-6
// y-5
// z-2,8

// x-1
// y-1
// z-1