package Questons;
import java.lang.reflect.Array;
import java.util.*;
public class prefix {
    public static void main(String[] args) {
        String str="aabcaaabcaabc";
        int n=str.length();

        int z[] =new int[n];
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            if(i>right){
                left=i;
                right=i;
                while(str.charAt(right)==str.charAt(right-left)){
                    right++;
                }
                right--;
                z[i]=right-left+1;
            }else{
                if(z[i-left]<z[right-i+1]){
                    z[i]=z[i-left];
                }else{
                    left=i;
                    while(right<n && str.charAt(right)==str.charAt(right-left)){
                        right++;
                    }
                    right--;
                    z[i]=right-left+1;
                }
            }
        }

        System.out.println(Arrays.toString(z));
    }
}
