// link :- https://practice.geeksforgeeks.org/problems/bubble-sort/1
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
    for(int i = 0; i <= n-2; i++){ // only for count 
        for(int j = 0; j < n-(i+1); j++){ // maintain the pair.
        if(arr[j] >= arr[j+1]){
            // swap 
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }else continue;
        }
    } 
    
    // for(int j = 0; j < n; j++){
    //     System.out.print(arr[j]+" ");
    // }
    }
}