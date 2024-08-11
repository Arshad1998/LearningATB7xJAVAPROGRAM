package august.ex_04082024.Constructors;

import august.ex_04082024.Constructors.DefaultConstructor.Car;

public class Lab162 {
    public static void main(String[] args) {

        // Constructors - Types
        // 1. default - Usage 70%
        // 2. Parameters - Usage 25%
        // 3. Copy Constructors(~) - Usage 1-4%
        // this vs super - why? they are used?
        // Static keyword and static methods


        // Constructors
        // 1. default - 70%
        // 2. Parameters - 25%
        // 3. Copy Constructors  - ~ 1-4%

                /*  We are creating a class person with name as a data member which is not assigned any value
        when we create an object

        Person p1 =new Person();
          Person ->  CLass loader will initiate the class person
          new Person() -> This will create a object in Heap area
          p1 - will be the reference

          Now the value name will be the default value null since we are not initializing it's value.
          we can initialize the value using reference
          but what if we need the data members to be initialized when the object is created or we need something to be executed
          when the object is created- Constructor is used for this


          Constructor is  special Method which has the same name as it's CLass
                Constructor and the statements inside them will be automatically called and executed
                diff types of constructor is called based on the parameters passed

                Constructor doesn't return any value
                Functions Return Value

                 */


        Car c = new Car();



    }
}
