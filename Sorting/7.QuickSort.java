// https://leetcode.com/problems/sort-an-array/submissions/901443878/
// TC- O(nlogn), S.C -- O(N)

class Solution {

    //  partiton function for return correct pivot index
    public int partition(int[] nums, int start, int end) {
        int pivot = nums[end];

        int left = start, right = start;
        while (right <= end) {
            if (nums[right] <= pivot) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            } else {
                right++;
            }
        }

        return left - 1; // this is the last index of <= region
    }
    // QuickSort 
    public void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        // either 0 elements or 1 array: already sorted

        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}