public class FindString {
    public static void main(String[] args) {
        String s="aaaaaabc";
        String ptrn="abc";
        boolean n=s.contains(ptrn);
        int i=s.indexOf(ptrn);
        System.out.println(n+" "+i);
    }
}
