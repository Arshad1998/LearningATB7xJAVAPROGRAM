package august.ex_17082024.WrapperClass;

public class Lab195 {

    public static void main(String[] args) {
        // Primitive to Wrapper class
        int a = 10;
        Integer b = a; //Auto Boxing
        // Integer.MAX_VALUE
        System.out.println(a);
        System.out.println(b);// extra utilities are added
        System.out.println(b);// extra utilities are added




        // Wrapper class to Primitive
        Integer a2 = 42; // Auto Boxing - int -> Integer
        int value = a2; //  UnBoxing - Integer -> int
        System.out.println(a2);
        System.out.println(value);

    }

}
