class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        String prefix = strs[0];
        String last = strs[strs.length - 1];
        int idx = 0;

        for(int i = 0; i < prefix.length(); i++){
            if(prefix.charAt(idx) == last.charAt(idx))
                idx++;
        }

        return prefix.substring(0,idx);
    }
}