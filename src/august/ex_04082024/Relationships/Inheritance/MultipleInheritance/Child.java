package august.ex_04082024.Relationships.Inheritance.MultipleInheritance;

public class Child extends Father{

        /*    Java does not support multiple inheritance for classes, which means a class cannot directly
      extend more than one class. This restriction is designed to avoid the complexity and ambiguity
       that can arise from the "diamond problem" of multiple inheritance.*/

        String name2 = "Arshad";

        void Child_name(){
            System.out.println(name2 + " " +name1);
        }

    public static void main(String[] args) {
        Child c = new Child();
        c.Child_name();
    }

}
