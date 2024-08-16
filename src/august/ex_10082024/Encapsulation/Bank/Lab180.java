package august.ex_10082024.Encapsulation.Bank;

public class Lab180 {
    public static void main(String[] args) {
        ICICI arshad = new ICICI("Arshad", 0);

        arshad.setBal(10000, false);
        System.out.println(arshad.getBal());

        ICICI admin = new ICICI("Admin", 0);

//      Here we have hardcoded the condition
/*      But in Automation for example
             We may Write a code to connect mySQL to verify if it's admin

*/

        admin.setBal(100000, true);
        System.out.println(admin.getBal());

    }

}
