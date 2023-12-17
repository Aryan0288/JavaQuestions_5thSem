// package Questons;
public class FindString {
    public static void main(String[] args) {
        // String s="aaaaaabc";
        // String ptrn="abc";
        // boolean n=s.contains(ptrn);
        // int i=s.indexOf(ptrn);
        // System.out.println(n+" "+i);


        // KMP alogrithm -> Knuth–Morris–Pratt algorithm

        String s= "abcd";
        String s1= "";
        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            s1=c+s1;
        }
        System.out.println(s1);

        


    }
}
