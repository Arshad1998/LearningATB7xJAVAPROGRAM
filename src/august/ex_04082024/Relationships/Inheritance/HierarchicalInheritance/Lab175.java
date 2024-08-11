package august.ex_04082024.Relationships.Inheritance.HierarchicalInheritance;

public class Lab175 {

    public static void main(String[] args) {
        Nazar Na = new Nazar();
        Na.Child1();

        Ashika Ai = new Ashika();
        Ai.Child2();

        Asha As = new Asha();
        As.Child3();

//      Every child can access Father but Father cannot access any child and child 1 cannot access child 2
        Na.Father_name();
        Ai.Father_name();
        As.Father_name();

    }

}
