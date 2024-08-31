package august.ex_24082024.Generic;

public class Lab249 {
    public static void main(String[] args) {

/*      Generic methods in Java, like generic classes, do not allow primitive data types directly.
        Generics in Java are designed to work with reference types, so if you want to use a primitive type
        with a generic method, you must use its corresponding wrapper class.*/

        System.out.println(temp("Pramod"));
        System.out.println(temp(123));
        System.out.println(temp(true));



        sum(3,4); //internally generic consider this as wrapper Integer
        sum("pramod","dutta");
        sum("pramod",34);

        // T - Ref to the Data Type that you want to use.

    }

    public static <T1, T2> void sum(T1 a, T2 b){
        System.out.println(a);
        System.out.println(b);
    }

    public static <Dutta> Dutta temp(Dutta name) {
        return name;
    }
}
