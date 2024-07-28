package ex_27072024;

public class Lab151 {
    public static void main(String[] args) {
        //Now since we covered array will learn last concept of String

        //String small recap
        // String - Bunch of Chars.
        //2 type of creating string
        String s1 = new String("pramod"); // Heap Area
        String s2 = "pramod"; // String constant pool

        // String - Immutable in nature
        // String with functions
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}
