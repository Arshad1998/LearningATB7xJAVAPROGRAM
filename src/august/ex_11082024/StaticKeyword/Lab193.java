package august.ex_11082024.StaticKeyword;

public class Lab193 {

/*   Static Keyword in Java
             The static keyword in Java is used to indicate that a particular member (variable, method, block, or nested class)
        belongs to the class itself rather than to instances of the class. This means that the static member is shared among
        all instances of the class.*/

 //   Static can be data member class function class

//    Nested class will be taken in next class

    public static void main(String[] args) {
//        ATB a1 = new ATB("Arshad");
//
//        System.out.println("Private variable accessed using object ref" + a1.getName());
//        System.out.println("Static variable accessed using class name directly" + ATB.courseName);
//
//        ATB a2 = new ATB("Farhana");
//        System.out.println("Private variable accessed using object ref" + a2.getName());
//        System.out.println("Static variable accessed using class name directly" + ATB.courseName); //static belongs to the class
//        // itself rather than to instances of the class. This means that the static member is shared among all instances of  class
//
//        System.out.print("a1 and a2 ");
//        ATB.doAssignment(); //Static Methods


//   Static Black and default block
        //ATB a1;  This doesn't initiate static block alone
        // new ATB("Arshad"); //initiates both static class and default block

        ATB a1 = new ATB("Arshad");

    }
}


class ATB{

//    This block will be executed when the object is created by default
    {
        System.out.println("IIB - Instance Initialization Block");
/*     What is the purpose? -
         Here you can write code related tp start a website or anything before starting the
         web automation or api automation*/
       // System.out.println("Reading from CSV file");
    }

//  This will be executed when CLass is loaded during object creation
    static {
        System.out.println("Class loaded, I will execute now");
    }



    private String name;  //name will be unique for each object hence we can use private
    private String phone;
    static String courseName = "ATB"; //But everyone will be under same course hence we can use static for this

//  We will getters and setters for accessing private data members but static can be accessed directly using class name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        System.out.println("Parametrized constructor also called and name is " + name);
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static class A{

    }
}
