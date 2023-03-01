// https://leetcode.com/problems/sort-an-array/submissions/901443878/
// T.C -- O(nlogn) Sc- O(N)

class Solution {
    public static int[] mergesort(int nums[],int lo, int hi){
        if(lo == hi){
            int base[] = new int[1];
            base[0] = nums[lo];
            return base;
        }
        int mid = (lo + hi)/2;
        int left[] = mergesort(nums,lo,mid);
        int right[] = mergesort(nums,mid+1,hi);

        return merge(left,right);
    }

    public static int[] merge(int left[], int right[]){
        int res[] = new int[left.length + right.length];
        int p1 = 0, p2 = 0, p3 = 0;

        while(p3 < res.length){
            int v1 = p1 < left.length ? left[p1] : Integer.MAX_VALUE;
            int v2 = p2 < right.length ? right[p2] : Integer.MAX_VALUE;

            if(v1 < v2) {
                res[p3] = v1;
                p1++; p3++;
            }else{
                res[p3] = v2;
                p2++; p3++;
            }
        }
        return res;
    }

    public int[] sortArray(int[] nums) {
        return mergesort(nums, 0, nums.length-1);
    }
}