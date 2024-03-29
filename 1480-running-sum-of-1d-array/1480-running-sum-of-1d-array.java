class Solution {
    public int[] runningSum(int[] nums) {

        
        //         brut froce 
    //     int res[]= new int[nums.length];
    //     for(int i = 0; i < nums.length; i++){
    //         // int sum = 0;
    //         for(int j = 0; j <= i; j++){
    //            res[i] += nums[j];
    //         }
    //     }
    //     return res;
        
        
        
//         Without extra space and O(n)
        
        // for(int i = 1; i <  nums.length; i++){
        //     nums[i] = nums[i-1] + nums[i];
        // }
        // return nums;
        
//         by prefix sum
        int prefix[] = new int[nums.length];
        
        for(int i = 0; i < prefix.length; i++){
            prefix[i] = nums[i] + ((i > 0) ? prefix[i - 1] : 0);
        }
        return prefix;
    }
    
}