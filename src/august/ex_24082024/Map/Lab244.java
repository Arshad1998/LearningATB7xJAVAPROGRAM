package august.ex_24082024.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244 {

    /*  Map
            It is an interface available in java.util package and introduced in the Collection Framework API.
        It is a key and a value and key is always unique in the Map. A Map cannot contain duplicate keys and each key
        can map to at most one value. Some implementations allow null key and null values like the HashMap and LinkedHashMap,
        but some do not like the TreeMap.

        Sub Interface of Map
          Hash map
          LinkedHash map
          Tree Map
          WeakHashMAp
        */
    public static void main(String[] args) {
        Map m1 = new HashMap(); //Not ordered

        m1.put("name","pramod");
        m1.put("rollNo",123);
        m1.put("phone",98765432);
        System.out.println(m1);

        Map m2 = new LinkedHashMap(); //Ordered

        m2.put("name","pramod");
        m2.put("rollNo",123);
        m2.put("phone",98765432);
        System.out.println(m2);

        Map m3 = new TreeMap(); //sorted with key value
        m3.put("name","pramod");
        m3.put("rollNo",123);
        m3.put("phone",98765432);
        System.out.println(m3);

    }
}
