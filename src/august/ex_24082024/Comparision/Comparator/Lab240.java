package august.ex_24082024.Comparision.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab240 {

    public static void main(String[] args) {
        Students s1 = new Students(3, "Farhana");
        Students s2 = new Students(5, "Sabreen");
        Students s3 = new Students(1, "Hussain");
        Students s4 = new Students(2, "Nilofar");
        Students s5 = new Students(3, "Abdul");

        List Students_List = new ArrayList();
        Students_List.add(s1);
        Students_List.add(s2);
        Students_List.add(s3);
        Students_List.add(s4);
        Students_List.add(s5);
        System.out.println(Students_List); //If you do this without overriding tostring() method then only clasname@haxvalue will printed

      //  Collections.sort(Student_List); //if you use this directly then This will give you Exception
                                               // since Student list is not an natural value to sort

        //Here this list of Students is not some natural value to sort. To sort this Students we created we can use Comparable or Comparator

        /*Comparator
                  Comparator is external to the element type we are comparing. It’s a separate class
                           Create separate classes how many we w */

        System.out.println("--------------------------------------------");

        Collections.sort(Students_List, new SortById());
        System.out.println(Students_List);

        System.out.println("--------------------------------------------");

        Collections.sort(Students_List, new SortByName());
        System.out.println(Students_List);

        System.out.println("--------------------------------------------");


        Collections.sort(Students_List, new SortByIDDesc());
        System.out.println(Students_List);


        System.out.println("--------------------------------------------");


        Collections.sort(Students_List, new SortByNameDesc());
        System.out.println(Students_List);



    }


}

class Students {
    Integer id;
    String name;

    public Students(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}

class SortByName implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

    class SortById implements Comparator<Students> {
        @Override
        public int compare(Students o1, Students o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    }

class SortByIDDesc implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

