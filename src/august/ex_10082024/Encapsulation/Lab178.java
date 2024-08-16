package august.ex_10082024.Encapsulation;

public class Lab178 {

    public static void main(String[] args) {

        LoginPage lp = new LoginPage();

        String User_Name  = lp.User_Name;
        String Password = lp.Password;

/*      When the data members of class LoginPage is public we can access it from anywhere using teh reference
        but there is no security for this */


/*     Encapsulation is a fundamental concept in JAVA which provides a way to handle these situations

          •	Encapsulation is a fundamental concept in object-oriented programming (OOP).
          •	Bundling of data and methods that operate on that data within a single unit.
          •	Data members should be private in nature.
          •	Methods with getter and setter only, you can access the data members / attributes.
          •	Getter and Setter - help you to get or set the value via the methods only, not with the reference.

          Lab179 will showcase the same prog with encapsulation concept


 */



    }

}



class LoginPage{

    public String User_Name = "ArsFAr";
    public String Password =  "Atreides#98";

        }