package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
                /*
        Type Casting - Source and Destination conversion
        Implicit(JVM automatically does this conversion)  a)Widening b)Narrowing
        Explicit(done explicitly)  a)Widening b)Narrowing
        Widening - Implicit, Explicit - lossless
        Narrowing - Implicit is invalid, Explicit(with data type), loss
        Widening
        */

//      Implicit Casting - smaller value stored into bigger value.

//      Widening - JVM automatically does this
        byte b=10;
        int a=b; // VALID – Implicit Casting - Widening

//      Narrowing - Invalid JVM does not do this automatically due to loss of data
//        int a1=10;
//        byte b1=a;


//      Explicit Casting - bigger value to smaller value.

/*      Widening - this is not needed since it can be done using implicit as well. int below in tha
        bracket is dark since it is not used
 */
        int b2 =10;
        int a2 = (int)b2; // VALID – Explicit Casting - Widening
        System.out.println(a2);

//      Narrowing - JVM will not do this automatically due to lack of data.


        // Narrowing
        int val = 300;
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);
    }
}
