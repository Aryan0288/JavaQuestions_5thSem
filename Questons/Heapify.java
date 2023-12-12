package Questons;
import java.util.Arrays;

public class Heapify {

    static void HeapifyMethod(int[] arr, int n, int parentIndex) {

        int leftChild = 2 * parentIndex + 1;
        int rightChild = 2 * parentIndex + 2;
        int largestIndex = parentIndex;
        if (leftChild < n && arr[leftChild] > arr[parentIndex]) {
            largestIndex = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[largestIndex]) {
            largestIndex = rightChild;
        }

        if (largestIndex == parentIndex) {
            // do something
            // parent is the largest
            return;
        } else {
            // parent is not the largest
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[largestIndex];
            arr[largestIndex] = temp;

            // recursive call to check the max-heap Relation
            HeapifyMethod(arr, n, largestIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{50,20,30,60,40,25};
        int n=arr.length;
        for(int i=(n-1)/2;i>=0;i--){
            HeapifyMethod(arr,n,i);
        }

        System.out.println("heapified array "+Arrays.toString(arr));

        // HeapSort 

        // After Initial Heapify 

        for (int i = n - 1; i >= 0; i--) { 
        
        // swap arr[0] and arr[i] 
        
        int temp = arr[0]; 
        
        arr[0] = arr[i]; 
        arr[i] = temp;
        
        HeapifyMethod(arr, i, 0); 
        
        System.out.println("Heap Sort Pass # : " + Arrays.toString(arr)); 
        
        }
    }
}
