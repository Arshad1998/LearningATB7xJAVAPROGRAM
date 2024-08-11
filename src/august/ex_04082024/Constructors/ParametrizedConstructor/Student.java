package august.ex_04082024.Constructors.ParametrizedConstructor;

public class Student {

    String name;
    long phone;

    public Student() {
        System.out.println("Object for student is created");
    }

    public Student(String name) {
        this.name = name; //This is similar to doing s1.name = "Arshad " in main function
    }

    public Student(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

//    We cannot define multiple parameterized constructor with same no of arguments
//        public Student(String name) {
//        this.name = name;
//    }
}
