package august.ex_04082024.Constructors;

public class Lab167 {

    //Before going into parametrized constructor learning the scope of variables

    int e= 45; // Instance Variable ( This is not Global Variable - Global variable is not there in Java)

    void f1(){
        int e = 10; // Local Variable
        System.out.println(e);
    }

    void f2(){
        e = 50;
        System.out.println(e);
    }
}
