import java.util.*;

public class AllPrime {
    static void isPrime(int n){
        boolean prime[] =new boolean[n+1];
        Arrays.fill(prime,true);

        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]==false){
                continue;
            }
            for(int j=i*i;j<=n;j+=i){
             prime[i]=true;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
