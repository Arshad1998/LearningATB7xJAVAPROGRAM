package july.ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "MohamedArshad";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ? Later in the session we will learn class
        String name2 = new String("MohamedArshad");
        // How many ways we can a String - 2
        // 1. simple assignment operator '='    2. new operator
        // = stores value in "SCP" // Sting constant Pool
        // new stores in Objects(heap)

        //functions available for String
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('A'));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(12));
        //System.out.println(name.charAt(13)); // Exception Index 13 out of bounds


    }
}
