package ex_21072024;

public class Lab122 {
    public static void main(String[] args) {
//       If with Continue
//      Continue -  Skip the remaining statements and move to the next iteration

        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue; //when i=5 the below 2 sout statements skipped and moved to next iteration
            }
            System.out.printf("Iteration No %d" ,i);
            System.out.println();
        }
    }
}
