package august.ex_04082024.Constructors.ParametrizedConstructor;

import java.util.Scanner;

public class BankAccount {

    String bankName;
    int balance;
    String bankCode; // Instance

    // DC - Here we are using DC to assign  values to data member
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

//   Using this we can get user input for all data members created of the object created without repeating code

//    public BankAccount() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Name of the Bank!");
//        String bName = sc.next();
//        System.out.println("Enter your Name of the Bal!");
//        int bal = sc.nextInt();
//        System.out.println("Enter your Name of the Bank Code!");
//        String bCode = sc.next();
//        sc.close();
//    }

    // PC - 3 Argument
    BankAccount(String bName,int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    BankAccount(String bName,int bal){
        this.bankName = bName;
        this.balance = bal;

    }

    BankAccount(String bName){
        this.bankName = bName;
    }


    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bal ->" + balance);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println();
    }
}
