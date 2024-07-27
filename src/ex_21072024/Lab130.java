package ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        // Coding Program
        // Factorial Program
        //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num,will print Factorial");
        int n = sc.nextInt();


        int fact = 1;
        // 5 -> i = 1 to 5 -    1*2 = fact,
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);

//        sc.close(); //        Note - though I created a new ref when I give sc.close before that prog failed

//      fact in reverse fact of 5*4*3*2*1
//        Scanner sc1 = new Scanner(System.in); //No need to use new ref we can get new i/p with same ref sc

        System.out.println("Enter a num,will print Factorial");
        int a = sc.nextInt();
        int f = 1;
        for(int i=a;i>0;i--){
            f = f*i;
        }
        System.out.println(f);


        sc.close();



    }
}
