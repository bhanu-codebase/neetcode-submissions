// StringBuilder does not have contains or clear or size methods dvdf dv 0 1 2
// vd 2 
// pwwkew pw
// abcabcbb
// It have indexOf(), append(), length();
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0, maxCount = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            // if(!sb.contains(ch+"")){ 
            char ch = s.charAt(i);
            if(sb.indexOf(ch+"")==-1){
                sb.append(ch+"");
            }
            else{
                count = sb.length();
                maxCount = Math.max(count, maxCount);
                while(sb.indexOf(ch+"")!=-1){
                    sb.deleteCharAt(0);
                }
                sb = sb.append(ch);
            }
        }
        maxCount = Math.max(maxCount, sb.length());
        return maxCount;
    }
}
// pwwkew
// sb = wke
// count = 3
// maxCount = 3