package august.ex_04082024.AccessModifiers.Interview;

public class Arshad {

    private String name;
    private int id;
    // Instance should be well protected.

    private void talk(){} //
    // only class within the same pacakage can see us

    /* We can create Class with class and they can be public too */
    public class shafeeq{

    }

    public class Azar{

    }
}


/*We can create 2 separate classes in a java class file but only one can  be public*/
//public class shafeeq{
//
//}