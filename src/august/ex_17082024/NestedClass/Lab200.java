package august.ex_17082024.NestedClass;

public class Lab200 {

    public static void main(String[] args) {
        OuterClass OC = new OuterClass();

//     Inner class object creation
        OuterClass.InnerCLass IC  = OC.new InnerCLass();
//        IC.printing1();

    }

}

// Nested Class - Rarely used in Automation

class OuterClass{

    Integer a = 10;
    static int b = 20;

    static {
//        System.out.println(a); // instance variable cannot be accessed
        System.out.println("SIB-OC ->" +b);
//        System.out.println(c); // instance variable cannot be accessed
    }

    void printing1(){
        System.out.println("OC - Method 1 ->" + a);
        System.out.println("OC - Method 1 ->" +b);
//        System.out.println(b);  //Outer class cannot use variables of inner class
    }

    static void printing2(){
//        System.out.println(a); // instance variable cannot be accessed
        System.out.println("OC - Static Method 1 ->" +b);
//        System.out.println(c); // instance variable cannot be accessed
    }

// --------------INNER CLASS--------------------

     class InnerCLass{

        Integer c = 30;

        static {
//            System.out.println(a); // instance variable of Outer Class also cannot be accessed
            System.out.println("SIB-IC ->" +b); //Static variable of outer class can be accessed
//            System.out.println(c); // instance variable Inner Class also cannot be accessed
        }

        void printing1(){
//          Inner class can use variables of outer class
            System.out.println("IC - Method 1 ->" +a);
            System.out.println("IC - Method 1 ->" +b);
            System.out.println("IC - Method 1 ->" +c);
        }
        static void printing2(){
//            System.out.println(a); // instance variable of Outer Class also cannot be accessed
            System.out.println("IC - Static Method 2 ->" +b); //Static variable of outer class can be accessed
//            System.out.println(c); // instance variable Inner Class also cannot be accessed
        }





    }
}
