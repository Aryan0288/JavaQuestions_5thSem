// package Questons;

import java.util.Arrays;

public class knapSack {
    static int functionCall=0;

    static int kSack(int[] w,int[] v,int n,int cap,int[][] memo){
        functionCall++;
        if(memo[n][cap]!=-1){
            return memo[n][cap];
        }
        if(cap==0 || n==0){
            return 0;
        }else{
            if(w[n-1]<=cap){
                int MaxSlected=v[n-1]+ kSack(w, v, n-1, cap, memo);
                int MaxNotSelected=kSack(w, v, n-1, cap, memo);
                int actual=Math.max(MaxSlected,MaxNotSelected);
                memo
                [n][cap]=actual;
                return actual;
            }
            else{
                return kSack(w, v, n-1, cap,memo);
            }
        }

    }
    public static void main(String[] args) {
        int n=22;
        int cap=1000;
        int[] weight={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        int[] value={30,50,20,40,10,23,42,44,5,6,70,78,45,36,27,31,94,124,563,212,22,311};
        // System.out.println(value.length);

        int[][] memo=new int[n+1][cap+1];

        for(int[] i:memo){
            Arrays.fill(i, -1);
        }
        System.out.println(kSack(weight, value, n, cap,memo));
        System.out.println(functionCall);
    }
}
