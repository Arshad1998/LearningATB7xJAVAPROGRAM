package august.ex_24082024.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab236 {
    public static void main(String[] args) {
        LinkedList Li = new LinkedList();
        Li.add("Node1");
        Li.add("Node2");
        Li.add("Node3");
        Li.add("Node4");
        System.out.println(Li);

//     If you look at both output there is no difference except how it is stored
        ArrayList l2 = new ArrayList();
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");
        System.out.println(l2);
    }
}
