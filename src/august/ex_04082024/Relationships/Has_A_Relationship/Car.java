package august.ex_04082024.Relationships.Has_A_Relationship;

public class Car {

/*  Has-A Relationship
         The Has-A relationship represents composition or aggregation. It describes a scenario where one class
       contains or is composed of another class. This relationship is established by having one class hold a
       reference to another class, indicating that one object "has" another object
       */

/*    My understanding - Without using inheritance(Is a Relationship). When a class holds or access the methods of another
    class using object reference is Has-Relationship
    */

    void Ignition(){
        new Engine().Starting();
        new Tyre().rolling();
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.Ignition();
    }
}
