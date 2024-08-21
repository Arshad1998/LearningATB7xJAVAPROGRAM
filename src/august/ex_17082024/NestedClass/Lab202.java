package august.ex_17082024.NestedClass;

public class Lab202 {

//  We usually cannot create object for Interface but Java provides a way which might look like an object can be create

    public static void main(String[] args) {

//      Anonymous CLass
        ABC a = new ABC()
        {
//            overridden method in anonymous class should be public
            @Override
            public void m1(){
                System.out.println("m1");
            }
        };
//  This might look like an object created for interface but internally an anonymous class is created which implements the interface


        CBA a1 = new CBA() {
            @Override
            void m3() {
                System.out.println("M3");
            }
        };


    }

}

interface ABC {
    void m1();
}

abstract class CBA{
    abstract void m3();
}
