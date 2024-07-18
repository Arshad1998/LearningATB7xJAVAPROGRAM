package ex_13072024;

public class Lab025 {
    public static void main(String[] args) {

        int a = 10;
        int b= 34;
        System.out.println(a+b);

        String s1 = "Mohamed";
        String s2 = "Arshad";
        System.out.println(s1+s2);
        System.out.println(s1+'\t'+s2);
        System.out.printf("%s %s" ,s1 ,s2);
        System.out.println();

        String s3 = "Amit";
        int x = 99;
        int y = 100;
//    + will act as a additional operator but once string come in + will concatenate
//    LbLeft to Right priority
        System.out.println(x+y+s3);
        System.out.println(s3+x+y);
        System.out.println(x+s3+y);
        System.out.println(x+y+s3+y+s3+x+y);
    }
}
