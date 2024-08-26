package august.ex_24082024.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab246 {

    public static void main(String[] args) {

//      THIS IS NOT USED SINCE IT IS A LEGACY CLASS AND SLOW

//        Before Map introduced we have HashTable which is a legacy class
        Hashtable<Integer,String> ht1 = new Hashtable<>();
        // Similar to Map mostly
        // does not accept null v
        // Synchronised and thread safe hence it is Slow

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

//      If we provide null value anywhere - null pointer exception will be thrown
//        ht1.put(null, "Pramod");
//        ht1.put(4, null);
//        ht1.put(null, null);


        //Enumeration applicable for vector and Hashtable to print values
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
