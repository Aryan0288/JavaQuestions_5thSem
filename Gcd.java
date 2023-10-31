class Gcd {

    static int findGCD(int a,int b){
        if(a==0){
            return b;

        }else{
            return findGCD(b%a, a);
        }
    }
    public static void main(String[] args) {
        int n=12;
        int m=42;
        System.out.println( findGCD(n, m));
       
    }    
}
