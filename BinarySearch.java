// Java implementation of iterative Binary Search 
class BinarySearch { 
	
	// Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 6,31,46,49,49,55,56,59,65,82}; 
        int x = 65; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at " + "index " + result); 
    } 
    
    // Returns index of x if it is present in arr[], 
    // else return -1 
    int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1,count=0; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
            count++;
            // Check if x is present at mid 
            if (arr[m] == x)
            {
            	System.out.println("The number of steps involved is: "+count);
                return m;
            }
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        System.out.println("The number of steps involved is: "+count);
        return -1; 
    } 
  
  
} 