// package Questons;

public class knapSack {

    static int kSack(int[] w,int[] v,int n,int cap){
        if(cap==0 || n==0){
            return 0;
        }

        else{
            return kSack(w, v, n-1, cap);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int cap=9;
        int[] weight={1,2,3,4,5};
        int[] value={30,50,20,40,10};

        int[][] memo=new int[n+1][cap+1];
        System.out.println(kSack(weight, value, n, cap));
    }
}
