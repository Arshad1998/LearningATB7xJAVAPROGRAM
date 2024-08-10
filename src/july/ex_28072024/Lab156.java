package july.ex_28072024;

import july.ex_27072024.Dog; // Dog class is in different package hence this is used and if it is not a public class then
                                 // it can't be used with import statement as well

public class Lab156 {

    public static void main(String[] args) {

/*      If Dog class is not in the same package then it will used in this package using import statement
        and the variable inside them can be used only if they are declared as public variable */
        Dog dog1Ref = new Dog();
        dog1Ref.name = "chow chow";  //This can be used since this is Public variable in Class Dog
 //     dog1Ref.breed = "Rajapalayam"; //This cannot be used since this is not a Public variable in Class Dog

        Dog dog2Ref = new Dog();
        dog2Ref.name = "german shepherd";

        // functions - perform a task , block of code
        // functions within the class are called -> methods?
        // class -> blueprint
        // object ->  real entity created from the class. / instance of the class.
        // 2 objects from same class occupies different memory address in heap area


    }
}
