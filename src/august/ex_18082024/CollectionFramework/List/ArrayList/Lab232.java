package august.ex_18082024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
/*   Array List can store elements of different data type
        but sorting can be done with same datatype(Logically that is only crct)*/
            List marks = new ArrayList();
            marks.add(91);
            marks.add(95);
            marks.add(56);
            marks.add(89);
            System.out.println(marks);
            System.out.println("--------------------------------------");
            Collections.sort(marks);  //Methods from Collection class
                System.out.println(marks);
            System.out.println("--------------------------------------");
            Collections.sort(marks, Comparator.reverseOrder());
                System.out.println(marks);
            System.out.println("--------------------------------------");



    }
}
