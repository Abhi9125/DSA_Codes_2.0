class Solution {
    
    public int firstPosition(int arr[], int target){
        int lo = 0, hi = arr.length- 1;
        int idx = -1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            
            if(target == arr[mid]){
               idx = mid;
                hi = mid - 1;
            }else if(target > arr[mid]) lo = mid + 1;
            else if(target < arr[mid]) hi = mid - 1;
        }
        return idx;
    }
    
    public int lastPosition(int arr[], int target){
        int lo = 0, hi = arr.length- 1;
        int idx = -1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            
            if(target == arr[mid]){
               idx = mid;
                lo = mid + 1;
            }else if(target > arr[mid]) lo = mid + 1;
            else if(target < arr[mid]) hi = mid - 1;
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        
        
        ans[0] = firstPosition(nums, target);
        ans[1] = lastPosition(nums, target);
        
        return ans;
    }
    
}