package ex_14072024;

public class Lab071 {
    public static void main(String[] args) {
        String s1 = "Mohamed";
        String s2 = s1;
        //only 1 SCP area is created
        System.out.println(s2);
        String s3 = s2.toLowerCase();
        // 2 SCP created one has Mohamed and another has mohamed
        System.out.println(s3);
        System.out.println(s1);
        // 2 - Pramod, pramod - SCP


    }
}
