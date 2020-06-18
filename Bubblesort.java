// Java program for implementation of Bubble Sort 
class BubbleSort 
{ 

    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        int arr1[] = {4,8,3,10,7,2,6,9,5,1}; 
        int arr2[] = {8,3,14,5,4,11,9,2,7,6,12,13,1,10};
        ob.bubbleSort(arr1); 
        System.out.println("Sorted array"); 
        ob.printArray(arr1); 
        ob.bubbleSort(arr2); 
        System.out.println("Sorted array"); 
        ob.printArray(arr2); 
    } 
    
    // bubble sort algorithm
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length, count=0; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    printArray(arr);
                    count++;
                } 
        System.out.println("The number of swaps:"+count);
    } 
  
    /* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
} 

