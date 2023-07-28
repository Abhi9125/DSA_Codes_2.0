class Solution {
    public int pivotIndex(int[] nums) {
        
//         i main tain pivot indx 
        for(int i = 0; i < nums.length; i++){ 
            int leftsum = 0 , rightsum = 0;
//             this for loop use for traversing
            for(int k = 0; k < nums.length; k++){
                if(k < i) leftsum += nums[k];
                else if(k > i) rightsum += nums[k];
                // System.out.println(leftsum+":"+rightsum);
            }
            // System.out.println(i);
            if(i == 0) leftsum = 0;
            else if(i == nums.length - 1) rightsum = 0;
            if(leftsum == rightsum) return i; 
        }
        return -1;
    }
}