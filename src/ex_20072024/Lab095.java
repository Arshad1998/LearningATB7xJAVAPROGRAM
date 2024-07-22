package ex_20072024;

public class Lab095 {
    public static void main(String[] args) {

//        Java switch expressions must be of byte, short, int, long(with its Wrapper type), enums and String.

        int a = 10;
        switch (a) {
            case 10:
                System.out.println("switch can take integer");
                break;
        }

        char ch = 'A'; // 65
        switch (ch) {
            case 65:
                System.out.println("switch can take char but will consider as int(ASCII -65)");
                break;
        }

//        boolean b = true;
//        switch (b) {
//        } // Switch cannot take boolean

        long a11 = 30l;
        switch ((int) a11) {
            case 30:
                System.out.println("long(with its Wrapper type) - Switch cannot take long but wrapped in int it can take");
                break;

        }
    }
}
