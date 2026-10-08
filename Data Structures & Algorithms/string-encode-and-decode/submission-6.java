class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for (String str : strs) {
            encoded_string += str + "\n";
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (left < str.length()) {
            if (str.charAt(right) != '\n') {
                right++;
            }
            else{
                decoded_strs.add(str.substring(left, right));
                left = right+1;
                right++;
            }
        }

        return decoded_strs;
    }
}
 