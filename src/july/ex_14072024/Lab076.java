package july.ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Mohamed";
        //String s1 = "M o h a m e d";
        //          |0|1|2|3|4|5|6|
        char c = s1.charAt(5);
        System.out.println(c);
        s1.concat(" Arshad"); //we are concatenating and Mohamed Arshad will be created in SCP s1 still points Mohamed only here
        System.out.println(s1);
        s1 = s1.concat(" Arshad"); // Now s1 pointing changed to concatenated value Mohamed Arshad
        System.out.println(s1);

    }
}
