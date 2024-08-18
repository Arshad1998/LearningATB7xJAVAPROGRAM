package august.ex_11082024.Abstraction.Interface.MultipleInheritance;

public class Son implements Father, Mother{

//   Here we are inheriting both Father and Mother But when we see deeply we are inheriting
//   the abstract methods and the overridden will happen at Sub class Son and hence it is considered as one class ony

    @Override
    public void loan() {
        System.out.println("This is only One Function");
    }

    @Override
    public void loan(String b, String c) {
        System.out.println("String b, String c");
    }

    @Override
    public void loan(String a) {
        System.out.println("String a");
    }

    @Override
    public void home() {

    }
}
