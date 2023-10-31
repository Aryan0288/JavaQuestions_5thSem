/**
 * PrimeFactor
 */
public class PrimeFactor {

    public static void main(String[] args) {
        int n=92;
        while(n%2==0){
            System.out.print("2 x ");
            n/=2;
        }
        // System.out.println(n);
        for(int i=3;i<=Math.sqrt(n);i+=2){
            // System.out.println(555);
            while(n%i==0){
                System.out.print(i+"x ");
                n/=i;
            }
        }
        if(n>2){
            System.out.println(n);
        }
        System.out.println("Terminate");
    }
}