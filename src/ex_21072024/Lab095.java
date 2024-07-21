package ex_21072024;

public class Lab095 {
    public static void main(String[] args) {

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
        switch ((int) a11)  //Switch cannot take long but covered to int it can take
        {
        }

    }
}
