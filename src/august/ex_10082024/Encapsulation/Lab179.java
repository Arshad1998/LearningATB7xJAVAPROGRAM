package august.ex_10082024.Encapsulation;

import java.util.Scanner;

public class Lab179 {
    public static void main(String[] args) {

        LoginPage1 lp1 = new LoginPage1();

//      when data members are private we can't use them directly

//        String User_Name  = lp1.User_Name;
//        String Password = lp1.Password;


//      Accessing the private data members using the public getter setter functions

        System.out.println(lp1.getUser_Name());
        System.out.println(lp1.getPassword());

        lp1.setUser_Name("FarArs");
        lp1.setPassword("Wanheda#98");


        System.out.println();
        System.out.println("Updated credentials");
        System.out.println();


        System.out.println(lp1.getUser_Name());
        System.out.println(lp1.getPassword());

//    Based on the req we can use getter and setter for the data member and also we can dd conditions on who can access this

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your code");
        String code = sc.next();
         if (code.equals( "ratata"))
         {

             boolean result = true;
             System.out.println("\nEnter the new password");
             String New_password = sc.next();
             lp1.setPassword_Secured(New_password, result);


             System.out.println();
             System.out.println(lp1.getUser_Name());
             System.out.println(lp1.getPassword());
         }
         else {
             System.out.println("You are not Authorized");
         }


        }

}



class LoginPage1{

//  By Encapsulation data members should be private

    private String User_Name = "ArsFar";
    private String Password =  "Atreides#98";


    public String getUser_Name (){
        return User_Name;
    }

    public void setUser_Name(String User_Name){
        this.User_Name = User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setPassword_Secured(String pass, boolean result) {
        if (result) {
            Password = pass;
            //if the variable name is same must use this operator or best practice to use this always
        }

    }




}
