package july.ex_28072024;

public class Animal {

    String name = "LOL";
    String color;


    void walk(){}
    void talk(){}

//  Main function within the Blueprint class
    public static void main(String[] args) {
        Animal animalrRef  = null; //Here Blueprint Class (Animal) is loaded but no entity created and no memory occupied
        Animal animalrRef2  = new Animal();
        Animal animalrRef3  = new Animal();
        Animal animalrRef4  = animalrRef2;
        System.out.println(animalrRef3.name);

        //Totally here only 2 entity is created
        //Class loader loads only one time after we can use it multiple times
    }
}
