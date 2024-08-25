package august.ex_24082024.Comparision;

import java.util.ArrayList;
import java.util.Collections;

public class Lab238 {
    public static void main(String[] args) {
//        Using lists we can sort the natural values like below
//        But in case of values or pair of values we create we need to use Comparable or Comparator
        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(98);
        marks.add(10);
        marks.add(99);
        Collections.sort(marks); // Natural Sorting
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Pramod");
        names.add("Amit");
        names.add("Dutta");
        names.add("Lukcy");
        Collections.sort(names); // A,D,L,P // Natural Sorting First Alpha
        System.out.println(names);




    }
}
