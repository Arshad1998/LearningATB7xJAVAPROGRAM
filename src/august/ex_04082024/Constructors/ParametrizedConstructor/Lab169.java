package august.ex_04082024.Constructors.ParametrizedConstructor;

import java.util.Scanner;

public class Lab169 {
    public static void main(String[] args) {

//      Initializing & printing values with Default constructor
        BankAccount b1 = new BankAccount();

//      Modifying & printing values with PC
        BankAccount b2 = new BankAccount("ICICI", 10000, "ICICI002" );

//      Modifying values with user input and printing
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank Code!");
        String bCode = sc.next();

        BankAccount b3 = new BankAccount(bName, bal, bCode);

//      This is not recommended since it is confusing while giving inputs
        BankAccount b4 = new BankAccount(sc.next(), sc.nextInt(), sc.next());

        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
        b4.printDetails();

        sc.close();


    }
}
