package august.ex_17082024.WrapperClass;

public class Lab194 {

    public static void main(String[] args) {
        int a = 10;
        // Data Type -> int
        // primitive - data type
        System.out.println(a);


        // Java like everything should a Class or Object(OOPs) -> Wrapper class comes into picture
        Integer a1 = 10;
        Integer b1 = 20;
        System.out.println(a1.compareTo(b1));

/*        Where Wrapper class used?
           When we use advanced java concepts(Collection framework) Wrapper classes use*/

/*        Wrapper Classes**
        - A Wrapper class is a class whose object wraps or contains primitive data types.
        - They convert primitive data types into objects.
        - Data structures in the **Collection framework, **ArrayList and Vector, Hashmap - They don't primitive data type
                - In API Automation, Web Automation -> avoid the primitive data types
                - Use primitive data types when you are working with core java project basic in nature
                - Automation -> Class and Objects - wrapper classes.


        Wrapper -> they have extra functions or utilities



         Why Use Wrapper Classes?
              1. Collection Framework we need to use the wrapper class.
              2. Storing null values. Object -> can be null
              3. Converting between primitive data types and strings:
              4. Performing mathematical operations*/



    }
}
