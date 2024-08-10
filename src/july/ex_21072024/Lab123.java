package july.ex_21072024;

public class Lab123 {
    public static void main(String[] args) {
//     Example for Continue inside for loop
        for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even Number -> " + i);
                continue;
            }
            System.out.println("Odd Number -> "+ i);
        }
    }
}
