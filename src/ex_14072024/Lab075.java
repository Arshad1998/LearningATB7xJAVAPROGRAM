package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("mohamed");
        String s2 = new String("mohamed");
        String s3 = new String("mohamed");


        System.out.println(s1 == s2); // Check for the ref
        System.out.println(s2 == s3); // Check for the ref
        System.out.println(s2.equals(s3)); // Check for the Content


    }
}
