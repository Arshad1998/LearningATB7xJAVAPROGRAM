package august.ex_24082024;

import java.util.ArrayList;
import java.util.List;

public class Lab248 {
    public static void main(String[] args) {
        // Generic - < 2%, very rare concept, rarly used also
        List<Object> mylist = new ArrayList();

        //If specific datatype is not added then any values can be added here similary we can have
        // this concept for functions and classes using generic - Lab249
        mylist.add("Pramod");
        mylist.add(123);
        mylist.add(true);


    }
}
