package Questons;
public class primeNo {
    static void prime(int n){
        boolean b=false;
        // System.out.println(Math.sqrt(n));
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                // System.out.println(n);
                b=true;
                return;
            }
        }
        if(b==false){
            System.out.println("N is a Prime No. : "+n);;
        }
    }
    public static void main(String[] args) {
        int n=20;
        for(int i=2;i<=n;i++){
            prime(i);
        }
    }
}
