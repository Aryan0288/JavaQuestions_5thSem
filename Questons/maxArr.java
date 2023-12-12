package Questons;
import java.util.Arrays;
import java.util.Scanner;

public class maxArr {
    public static void main(String[] args) {
        int[] arr=new int[]{3,2,4,3,2,6,3,2};

        int n=arr.length;
        // int max=arr[0];
        // for(int i=1;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        Arrays.sort(arr);
        
        // System.out.println(arr[n-2]);


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int c=a/b;
        System.out.println(c);
    }
}
