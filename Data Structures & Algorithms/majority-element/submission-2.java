class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cnd = -1;

        for(int num : nums){
            if(count == 0){
                count = 1;
                cnd = num;
            } else if(cnd == num){
                count++;
            }else{
                count--;
            }
        }

        return cnd;
    }
}