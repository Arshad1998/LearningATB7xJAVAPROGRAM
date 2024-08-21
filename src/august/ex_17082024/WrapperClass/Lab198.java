package august.ex_17082024.WrapperClass;

public class Lab198 {
    public static void main(String[] args) {

        A a1 = new A();
        System.out.println(a1.price);
        System.out.println(A.discount);

        A.m1(); //Static variable is recommended to be accessed only using class name
        a1.m2();

        A a2 = new A();
        new A();

        // During second object creation Static is not loaded bcoz it will be loaded only once for a class
        //IIB will be loaded whenever an object is created


    }

}
    class A{
        int price = 20000; //instance variable
        static int discount = 200; //static variable

        static{
            System.out.println("SIB-A"); //Static block will be loaded only once for a class
            //During second object creation it won't be loaded

        }

        {
            System.out.println("IIB-A");  //IIB will be loaded whenever an object is created

        }

        static void m1(){
            System.out.println("Method 1");
//          System.out.println(price);    -> We cannot use non-Static variable inside static method
            System.out.println(discount);
        }

        void m2(){
            System.out.println("Method 2");
            System.out.println(price); //Static variable can be used inside non-static method
            System.out.println(discount);
        }


    }

