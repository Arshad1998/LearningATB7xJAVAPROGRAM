package ex_27072024;

import java.util.Scanner;

public class Lab145 {
    public static void main(String[] args) {

//        public static void main(String[] args) - main is 3rd type of function with input parameters as String array
//        System.out.println(args[0]); //if I print this before giving values exception error comes not default values

        // input values in edit config next to run at top
        //User input - we are not able to give input values via Sc but we are able to replace given value using sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter girl's name");
        args[2]=sc.next();
        System.out.println("Enter boy's name");
        args[3] = sc.next();

        System.out.println("Length of String array in main function is" +args.length +'\n');
        if (args.length > 0) {
            for (int i = 0; i < args.length ; i++) {
                System.out.println(args[i]);
            }

        }else{
            System.out.println("No Arguments given");
        }

    }
}
