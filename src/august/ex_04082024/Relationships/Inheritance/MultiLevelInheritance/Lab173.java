package august.ex_04082024.Relationships.Inheritance.MultiLevelInheritance;

import javax.sound.midi.Soundbank;

public class Lab173 {

    public static void main(String[] args) {


        Son S = new Son();
//      Multilevel Inheritance Son extends Father who extends Grand Father
//          Here using son's reference we ccan call methods of Father and Grand father

        S.S_Calling();
        S.F_Calling();
        S.GF_Calling();
        System.out.println();


        Father F = new Father();

//       Father can call Grand Fathers Method
        F.F_Calling();
        F.GF_Calling();
        System.out.println();


        GrandFather GF = new GrandFather();

//      Grand Father cannot call Father and Son's method
        GF.GF_Calling();
        System.out.println();

/*     If all the classes in multi level inheritance has method or variable with same name then
           the local to the ref will be called first*/
        System.out.println("local variable will called first ->" + S.F_name);

        /* Both son and Father has variable F_name but when called with S reference local variable of S_name printed
         */

        //For usage of inheritance in Automation Testing Goto -> Real example package in inheritance

    }
}
