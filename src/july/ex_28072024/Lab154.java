package july.ex_28072024;

public class Lab154 {

    public static void main(String[] args) {
        // OOPs is uses this a Concept and Programming lang that uses this called as Object Oriented Programming language
        // Real life problem can be easily represented using OOPs concepts
        // Example -> Creating - New planet with AHuman
        // Attributes / Properties -> 2 hand, eye color, node, mouth, height, weight, body color, hair color
        // Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear().

        // AHuman 1
        // Amit - Name
        // Attributes ->
        // Behaviour ->


/*       We need to create Class Person now which has the set of Attributes and Behavior which will act as a Blueprint
        for AHuman in the planet we created*/

        /*In simple terms, CLass is the blueprint and the real thing created using that(AHuman in this case) is object
           Class -> Blueprint (No memory is allocated)
           Object - Each AHUman
            */

        AHuman AHuman1 = new AHuman();
        // Real thing class -> Object
        String name1 = AHuman1.name1;
        String hand1 = AHuman1.Hands;
        AHuman1.nickName = "Rio";


        AHuman AHuman2 = new AHuman();
        // Real thing class -> Object
        String name2 = AHuman2.name2; //Storing the attribute in local variable and printing
        String hand2 =  AHuman2.Hands;
        AHuman2.nickName = "Rizz";

        System.out.println(name1);
        System.out.println(AHuman1.name1); //Directly printing the attribute i=using object
        System.out.println(name2);
        System.out.println(AHuman2.name2);
        System.out.println("Nickname of AHUman1 is" + AHuman1.nickName);
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println("Nickname of AHUman2 is" + AHuman2.nickName);

        AHuman1.speak();
        AHuman2.walk();



    }
}
