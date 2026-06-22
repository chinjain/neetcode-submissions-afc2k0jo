class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int total = 0;

        for(int num : nums){
            sum += num;
            int rem = sum - k;

            if(map.containsKey(rem)){
                total += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return total;
        
    }
}