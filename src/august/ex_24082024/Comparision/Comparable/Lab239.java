package august.ex_24082024.Comparision.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab239 {

    public static void main(String[] args) {
        Student s1 = new Student(3, "Farhana");
        Student s2 = new Student(5, "Sabreen");
        Student s3 = new Student(1, "Hussain");
        Student s4 = new Student(2, "Nilofar");
        Student s5 = new Student(3, "Abdul");

        List Student_List = new ArrayList();
        Student_List.add(s1);
        Student_List.add(s2);
        Student_List.add(s3);
        Student_List.add(s4);
        Student_List.add(s5);
        System.out.println(Student_List); //If you do this without overriding tostring() method then only clasname@haxvalue will printed

      //  Collections.sort(Student_List); //if you use this directly then This will give you Exception
                                               // since Student list is not an natural value to sort

        //Here this list of Students is not some natural value to sort. To sort this Students we created we can use Comparable or Comparator

        /*Comparable object
                  It is capable of comparing itself with another object. The class itself must implements the
          java.lang.Comparable interface to compare its instances.

          implement and override the compare to method
         */

        Collections.sort(Student_List);
        System.out.println(Student_List);



    }


}

class Student implements Comparable<Student>{
    Integer id;
    String name;

    public Student(Integer id, String name) {
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
        return "Student{" + "id=" + id +  ", name='" + name + '\'' + '}';
    }

//  To Sort with id

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//    }

//To sort with name
    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name , o.name);

//        Using Comparable we can compare only using any one value
    }
}
