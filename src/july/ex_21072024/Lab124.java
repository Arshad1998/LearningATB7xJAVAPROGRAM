package july.ex_21072024;

public class Lab124 {
    public static void main(String[] args) {
//      Same exercise as Lab123 with break
        for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                break;
            }
            System.out.println("Odd -> "+ i);
        }
    }
}
