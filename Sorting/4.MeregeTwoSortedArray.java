// link -- https://nados.io/question/merge-two-sorted-arrays

public class Main {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
      //write your code here
      int res[] = new int[a.length+b.length];
      int p1 = 0, p2 = 0, p3 = 0;
      int max = Integer.MAX_VALUE;
      while(p3 < res.length){
        int v1 = (p1 < a.length) ? a[p1] : max;
        int v2 = (p2 < b.length) ? b[p2] : max;
  
        if(v1 < v2){
          res[p3] = v1;
          p1++;
        }else{
          res[p3] = v2;
          p2++;
        }
  
        p3++;
      }
      
      return res;
    }
  
    public static void print(int[] arr){
      for(int i = 0 ; i < arr.length; i++){
        System.out.println(arr[i]);
      }
    }
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] a = new int[n];
      for(int i = 0 ; i < n; i++){
        a[i] = scn.nextInt();
      }
      int m = scn.nextInt();
      int[] b = new int[m];
      for(int i = 0 ; i < m; i++){
        b[i] = scn.nextInt();
      }
      int[] mergedArray = mergeTwoSortedArrays(a,b);
      print(mergedArray);
    }
  
  }