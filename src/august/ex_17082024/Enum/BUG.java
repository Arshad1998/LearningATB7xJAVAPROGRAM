package august.ex_17082024.Enum;

public enum BUG
{

/*    In Java, an enum (short for "enumeration") is a special data type that allows you to define a collection of constants,
    often representing a fixed set of related values. Each constant in an enum is an instance of the enum type, and enums are particularly
    useful when you have a predefined set of values that a variable can hold, like days of the week, directions, or status codes

    */

// This is an Enum datatype having priorities as constants

//    Low,
//    Medium,
//    High

//  If we need any values for these we need constructor with the required parameter


    Low("Priority is low"),
    Medium("Priority is Medium"),
    High("Priority is High"),
    Vhigh("Priority is Very high");




    private String name;

    BUG(String name){
    this.name=name;
        System.out.println("Constructor is loaded");
    }

    public String getBugStatus() //public here makes the method to be accessed from different packages
    {
        return name;
    }

}
