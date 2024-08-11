package august.ex_04082024.General;

public class Lab166 {

    //when u creating a class as a Blueprint of an object don't use main function inside that
    // This exercise shows what happens if we do that

    public static void main(String[] args) {

        GeneralExample g = new GeneralExample();
        g.talk();

        //No error and Statements inside the 2nd main is not executed - This is not a right way though there is no error

//        GeneralExample.main(args); // Using this we can make the second main to be executed but it is not recommended so far

    }



}
