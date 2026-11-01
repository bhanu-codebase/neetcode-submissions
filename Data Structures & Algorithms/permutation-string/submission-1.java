class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2){
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq1, freq2)){
            return true;
        }
        // slide the window
        for(int i = n1; i < n2; i++){
            freq2[s2.charAt(i) - 'a']++; // add new char
            freq2[s2.charAt(i - n1) - 'a']--; // remove old char
            if(Arrays.equals(freq1, freq2)){
                return true;
            }
        }
        return false;
    }
}