// link -- https://practice.geeksforgeeks.org/problems/selection-sort/1

class Solution
{
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int count = 0; count < n-1; count++){
	        int min = Integer.MAX_VALUE;
	        int minidx = 0;
	        for(int j = count+1; j < n; j++){
	            if(arr[j] < min){
	                min = arr[j];
	                minidx = j;
	            }else continue;
	        }
	        if(arr[count] > arr[minidx]){
	            int temp = arr[count];
	            arr[count] = arr[minidx];
	            arr[minidx] = temp;
	        }
	    }
	}
}