// link -- https://practice.geeksforgeeks.org/problems/insertion-sort/1

class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 1; i < n; i++){
          for(int j = i; j > 0; j--){
              if(arr[j - 1] > arr[j]){
                  int temp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;
              }
          }
      }
  }
}