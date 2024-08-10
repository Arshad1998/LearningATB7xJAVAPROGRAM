package july.ex_21072024;

public class Lab116 {
    public static void main(String[] args) {

//      for loop where initialization done outside - no changes same output
//        but condition & updation cannot be taken out of loop


        int j = 10;
        for (; j>0 ; j--) {
            System.out.println(j);
        }
        System.out.println();

//        'i' initialized inside for loop only valid inside the loop
//        If you initialize outside for loop you won't be able to use the same in further for loop in the same method

////      Updation can be done inside body of the loop at last
//
        for(int i=0;i<=10;)
        {
            System.out.println(i);
            i++;
        }
        System.out.println();

//        Di the below to check the output of 0-1 in java
//        int a= -1;
//        int b= 0;
//        System.out.println(a+b);
//        System.out.println(--b);

        for(int i=0;i>=-10;i--)
        {
            System.out.println(i);
        }
    }
}
