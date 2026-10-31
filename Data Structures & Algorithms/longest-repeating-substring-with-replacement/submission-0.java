class Solution { // aaababb
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // 3 1
        int ans = 0; // 3
        int maxFreq = 0;
        int l = 0, r = 0; // l = 0, r = 3
        while(r < s.length()){
            char ch = s.charAt(r); // b
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            // invalid window
            while((r-l+1) - maxFreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            // valid window
            ans = Math.max(ans, (r-l+1));
            r++;
        }
        return ans;
    }
}
// xyyx
// l
// r
// ch=x
// window = x

// x-2
// y-2

// aaababb 
// a-4
// b-3

// algo
// window leni h 
// max freq calculate
// check replacements needed
// valid window?
// ans