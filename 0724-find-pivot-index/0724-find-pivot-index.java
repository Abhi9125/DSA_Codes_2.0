class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalsum = 0;
        
        for(int val : nums){
            totalsum += val;
        }
        
        int leftsum = 0;
        int rightsum = totalsum;
        
        for(int i = 0; i < nums.length; i++){
//             rightsum me curr index ka sum nhi hona chahiye so isliye sabse pahle hm rightsum ko sahi kr rhe hai.
            rightsum -= nums[i];
            
//             Ab leftsum me left ki val h and rightsum m right ki value hai.
            if(leftsum == rightsum) return i;
            
//          
            leftsum += nums[i];
        }
        return -1;
    }
}