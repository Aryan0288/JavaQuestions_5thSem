package Questons;
public class QuickSort {
    static int findPivot(int[] arr,int start,int end){
        int pivot =arr[end];
        int findSmallerEqual=start; //blue
        int largeValue=start-1;  // red

        while(findSmallerEqual<=end){
            // find the value that is less than equal to pivot
            while(findSmallerEqual<=end &&  arr[findSmallerEqual]>pivot){
                findSmallerEqual++;
            }
            // System.out.println();
            // increment second pointer
            largeValue++;

            // swap

            int temp=arr[findSmallerEqual];
            arr[findSmallerEqual]=arr[largeValue];
            arr[largeValue]=temp;
            findSmallerEqual++;
        }
        return largeValue;
    }
    static void quickSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int pivotIndex=findPivot(arr, start, end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr,pivotIndex+1,end);
    }
    public static void main(String[] args) {
        int[] arr={5,4,6,3,2,5,7,9};
        int n=arr.length;
        quickSort(arr, 0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // select a pivot element
    }
}
