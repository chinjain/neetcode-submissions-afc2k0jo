class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cnd = 0;

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

        count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == cnd)
                count++;
        }

        if(count > nums.length / 2)
            return cnd;

        return -1;
    }
}