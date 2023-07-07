import java.util.*;

public class Array {
  //LINEAR SEARCH
  public static int searchKey(int arr[] ,int key) {
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        return i;
    }
}
return -1;
} 
  
 //LARGEST & SMALLEST ELEMENT IN AN ARRAY
   public static int larfAndSmallEle(int arr[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
     
    for(int i =0 ; i<arr.length ; i++){
         if(largest < arr[i]){
          largest = arr[i];
        } 
         if(smallest > arr[i]){
          smallest = arr[i];
        }
    
    }
    System.out.println("SMALLEST ELEMENT :"+ smallest);
    return largest;
  }
  
  //REVERSE IN AN ARRAY 
  public static void reverseArr(int arr[]) {
    int start = 0;
      int end = arr.length-1;
    while(start<end){
      int temp=arr[end];
          arr[end] =arr[start];
          arr[start]=temp;

          start++;
          end--;
    }
    for(int i=0; i<arr.length ; i++){
      System.out.print(arr+" ");
    }
    System.out.println();
   }

  //PAIRS IN AN ARRAY & COUNT PAIRS
  public static void pairs(int arr[]) {
    int tp=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        System.out.print("( "+arr[i]+" ,"+arr[j]+" )");
        tp++;
      }
      System.out.println();

    }
    System.out.println(tp);
  }

  //PRINT SUBARRAY
  public static void subArray(int arr[]){
    int ts=0;
    int add=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
       for(int k=i;k<=j;k++) 
        System.out.print(arr[k]+" ");
        System.out.println();
        ts++;
        

      }
      System.out.println();
    }
    System.out.println(ts);
  }

  
 
  public static void main(String[] args){
    // int arr[]={2,4,6,8,9};
    // int key=6;
    // System.out.println("KEY AT INDEX: "+searchKey(arr, key));

    // int arr[]={2,4,6,8,9};
    // System.out.println("LARGEST ELEMENT ::"+larfAndSmallEle(arr));
    
    // int arr[]={2,4,6,8,9};
    // reverseArr(arr);

    // int arr[]={2,4,6,8,9};
    // pairs(arr);

    int arr[]={2,4,6,8,9};
    subArray(arr);
    
  }
}
