package august.ex_04082024.Constructors.ParametrizedConstructor;

import java.lang.reflect.Type;

public class Lab168 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name); //Here the value of name will be default value null
        s1.name = "Arshad "; //Giving value to name for s1 object
        s1.phone = 8680933987l;
        System.out.println(s1.name);
        System.out.println(s1.phone);


//      But what if we can provide a value to name while creating object - This can achieved using Parameterized constructor
//      Default constructor will be executed even when parameterized constructor is called

/*      Parametrized Constructor
          Will be executed only when the object created with required attributes
          No Return Type
          We can define multiple parameterized constructor with diff no of arguments but not with same no of arguments*/


        Student s2 = new Student("Shafeeq");
        s2.phone = 7092951876l;

        System.out.println(s2.name);
        System.out.println(s2.phone);

        Student s3 = new Student("Farhana", 7401444012l);
        System.out.println(s3.name);
        System.out.println(s3.phone);

    }
}
