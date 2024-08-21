package august.ex_17082024.Enum;

public class Lab203 {
    public static void main(String[] args) {

//      Using constants from BUG enum

        System.out.println(BUG.Low);//This will execute the constructor number of times to the no of constants declared
        System.out.println(BUG.Low.getBugStatus());
        System.out.println(BUG.Medium);
        System.out.println(BUG.Medium.getBugStatus());
        System.out.println(BUG.High);
        System.out.println(BUG.High.getBugStatus());
        System.out.println(BUG.Vhigh);
        System.out.println(BUG.Vhigh.getBugStatus());

        System.out.println("--------------------------------\n");
        System.out.println( BUG.valueOf("Low"));
        System.out.println( BUG.values());
        System.out.println("--------------------------------\n");


//      Using constants from Pages enum

        System.out.println(Pages.LOGINPAGE);
        System.out.println(Pages.CHATBOTPAGE);
        System.out.println(Pages.SUPPORTPAGE);
        System.out.println("--------------------------------\n");

//      Using constants from Colors enum

        System.out.println(Colors.RED);
        System.out.println(Colors.GREEN);
        System.out.println(Colors.BLUE);

        System.out.println("Hex Value of Red is" + Colors.RED.getValue());
        System.out.println("--------------------------------\n");


    }
}
