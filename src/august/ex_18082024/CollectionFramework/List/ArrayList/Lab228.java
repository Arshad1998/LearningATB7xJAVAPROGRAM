package august.ex_18082024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class Lab228 {

    public static void main(String[] args) {
        // Collections Framework
        // Collection - Interface
        // Collection(Interface) -> List (Interface)
        // List (Interface) -> ArrayList, LinkedList, Vector, Stack

//    List Examples in Real Life - Shopping List, Marks List, Collection of items, Todo List, Student List.

//     We can create reference in any of the below type. Dynamic Dispatch is preferred since we can access overridden methods both classes
//        Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
//        List mylist = new ArrayList(); //  Dynamic Dispatch

        ArrayList mylist = new ArrayList();
        mylist.add("Amanullah");
        mylist.add("Thasneem");
        mylist.add("Arshad");
        mylist.add("Farhana");
        mylist.add("Shafeeq");

        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.contains("Amit"));
        System.out.println(mylist.get(3));
        String s1 = (String) mylist.get(4);
        System.out.println(s1);


/*      Array list works exactly same as Array internally in memory allocation
               But in Array List when we reached size-1, size will automatically doubled*/



    }
}
