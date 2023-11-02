public class BubbleSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // bubble sort
    static void bubbleSort(int[] arr,int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Insertion sort
    static void insertionSort(int[] arr, int n) {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                int j=i;
                while(j>=0 && arr[j]>temp){
                    j--;
                }
                arr[j+1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 52, 45, 12, 35, 26 };
        int n = arr.length;
        System.out.println("Bubble Sort : ");
        bubbleSort(arr,n);
        System.out.println("\nInsetion Sort : ");
        insertionSort(arr, n);
    }
}
