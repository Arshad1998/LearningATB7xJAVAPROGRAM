package ex_21072024;

public class Lab097 {

    public static void main(String[] args) {
        // JDK >= 13 will allow multiple conditions in switch

        int itemcode  = 007;
        switch (itemcode){
            case 001,002,003: //range is not allowed but we can give all values
                System.out.println("It is an Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is a Mechanical Gadget!");
                break;
            default:
                System.out.println("None");

        }




    }
}
