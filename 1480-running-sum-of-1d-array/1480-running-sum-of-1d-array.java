class Solution {
    public int[] runningSum(int[] nums) {
//         brut froce 
        int res[]= new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            // int sum = 0;
            for(int j = 0; j <= i; j++){
               res[i] += nums[j];
            }
        }
        return res;
    }
}