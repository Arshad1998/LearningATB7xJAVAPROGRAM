package july.ex_28072024;

public class Lab155 {

    public static void main(String[] args) {

        // Class - Attribute / properties which is mostly defined using data Types(primitive or Non-primitive)
        // Class - Behaviour /Methods (functions inside class) -> which defined the behaviour of an entity created from CLass

        // object - real entity created from Class(will be created in main function)

        // ClassName classRef = new ClassName(); //Syntax of object creation
            // ClassName = Class Name which blueprint you are using
            // classRef - THis is only the Ref of the object(Don't consider this as a object)
            // new ClassName(); -  This is the Object

        //How these are stored in Java
        // Class is just a Blueprint and not a real entity hence it won't take any memory in JAVA
        // When an object created ClassName classRef = new ClassName();
        // (ClassName)Class Loader will load the ClassName and assign default values to the data members
        // new ClassName will create object in Heap area which take a space in memory
        // classRef will point the created entity



        Building dlf = new Building();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();


        Building prestige = new Building();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.useLift();

    }
}
