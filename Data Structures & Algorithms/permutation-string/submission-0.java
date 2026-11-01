class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] freq = new int[26];
        int n1 = s1.length();
        int n2 = s2.length();
        int l = 0, r = n1-1;
        while(r < n2){
        boolean flag = false; // should be initialize for every window
            for(int i = l; i <= r; i++){
                freq[s2.charAt(i) - 'a']++;
            }
            for(int i = 0; i < n1; i++){
                freq[s1.charAt(i) - 'a']--;
            }
            for(int i = 0; i < freq.length; i++){
                if(freq[i] != 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return true;
            }
            l++;
            r++;
            freq = new int[26];
        }
        return false;
    }
}
// leajnbjsc