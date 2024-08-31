package august.ex_24082024.Generic;

public class Lab250 {
    public static void main(String[] args) {
        Student<String, Integer> st = new Student<String, Integer>();

        st.setName("Arshad");
        st.setMarks(100);

        System.out.println(st.getName());
        System.out.println(st.getmarks());
    }
}

class Student<T1, T2> {

    T1 name;
    T2 marks;

    public T1 getName() {
        return name;
    }

    public void setName(T1 name) {
        this.name = name;
    }

    public void setMarks(T2 marks) {
        this.marks = marks;
    }

    public T2 getmarks() {
        return marks;


    }
}

