package july.ex_27072024;

public class Lab143 {
    public static void main(String[] args) {

        // Disadvantage of array
        //1. Fixed Data Type (homo)
        //2.  Fixed Length.
        // 3. wastage of memory
        int [] ages = new int[100];
        ages[1]  = 99;
        System.out.println(ages[1]); // out of 100 elements only 2 used remaining wasted
        ages[1]  = 100;
        System.out.println(ages[1]);// element value can be changed




    }
}
