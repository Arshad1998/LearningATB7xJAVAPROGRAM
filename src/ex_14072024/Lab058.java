package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F; //18.45% GST
        //int total_price = course+GST; // Implicit Narrowing (int+float = float) - we are saving float in int
        int total_price = course+(int)GST; // we can do Explicit narrowing but there will be money loss of .45
        System.out.println(total_price);
        // If u need full value
        float GST_Actual = course + GST ;
        System.out.println(GST_Actual);
    }

}
