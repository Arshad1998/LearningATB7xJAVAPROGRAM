package august.ex_24082024.List.Stack;

import java.util.Stack;

public class Lab237 {
    public static void main(String[] args) {
        // Vector, Stack - Legacy - 95% of time we are not going to use it in automation
        // legacy? - old ->

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.add("Amit2"); //Push(only for Stack like behaviour) and add(Common for all) are similar we can use what we want
        System.out.println(s);
        //Yop of the Stack
        System.out.println(s.peek());
        //Remove top element
        System.out.println("Element removed " + s.pop());

        System.out.println(s);


        //If u have a need to remove element from middle, Don't choose Stack
        //Understand ur need and choose the applicable Collection framework(DSA)




    }
}
