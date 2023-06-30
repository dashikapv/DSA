class Reverse_array {
	
// method for reversing an array  
public int[]  reverseArray(int arr[])  
{  
    // computing the size of the array arr  
    int size = arr.length;  
      
    // two pointers for reversing   
    // the input array  
    int ptr1 = 0;  
    int ptr2 = size - 1;  
      
    // reversing the input array  
    // using a while loop  
    while(ptr1 < ptr2)  
    {  
        int temp = arr[ptr1];  
        arr[ptr1] = arr[ptr2];  
        arr[ptr2] = temp;  
          
        ptr1 = ptr1 + 1;  
        ptr2 = ptr2 - 1;  
    }  
      
    return arr;  
      
}  
  
// main method  
public static void main(String argvs[])   
{  
  // creating an object of the class ReverseArr1  
  Reverse_array obj = new Reverse_array();  
    
  // input array - 1  
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};  
    
  // computing the length  
  int len = arr.length;  
    
    
  System.out.println("For the input array: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(arr[i] + " ");  
  }  
    
  int ans[] = obj.reverseArray(arr);  
    
  System.out.println();  
  System.out.println("The reversed array is: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(ans[i] + " ");  
  }  
    
  System.out.println("\n ");  
    
  // input array - 2  
  int arr1[] = {4, 8, 3, 9, 0, 1};  
    
  // computing the length  
  len = arr1.length;  
    
    
  System.out.println("For the input array: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(arr1[i] + " ");  
  }  
    
  int ans1[] = obj.reverseArray(arr1);  
    
  System.out.println();  
  System.out.println("The reversed array is: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(ans1[i] + " ");  
  }  
        
   
}  
} 