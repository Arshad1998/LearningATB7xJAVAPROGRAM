package august.ex_24082024.Set;

import java.util.*;

public class Lab242 {

    public static void main(String[] args) {
        // List - > Duplicate Allows
        // Set -> Doesn't allow Duplicate (Three Subclass - HashSet LinkedHashSet & TreeSet)
        Set hd = new HashSet();  //Avoids duplicate but case-sensitive and Order is not maintained

        hd.add("Watermelon"); //garbage collector will delete the duplicate
        hd.add("Apple");
        hd.add("Mango");
        hd.add("watermelon");
        hd.add("Watermelon");
        hd.add(null); //adding null is not a problem

        System.out.println(hd);


        Set lhs = new LinkedHashSet(); //Avoids duplicate but case-sensitive and Order is maintained

        lhs.add("Lichie");
        lhs.add("Lemon");
        lhs.add("Grapes");
        lhs.add("Mosambi");
        lhs.add("Lichie");
        lhs.add("lichie");
        lhs.add(null); //adding null here is not a problem

        System.out.println(lhs);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet(); // Uses Black and Red Tree mechanism to store the element, order will maintain and automatically sorted
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Mango");
        ts.add("orange");
        ts.add("Apple");
//        ts.add(null);  //adding null causes Exception bcoz Tree set does sorting automatically which is impossible with null

        // ts.add(null); # Can we sorting with null?
        System.out.println(ts);


//     Printing the Set

        System.out.println("--------------------------------------------");
        for (Object s: ts)
        {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
