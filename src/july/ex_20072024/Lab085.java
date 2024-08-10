package july.ex_20072024;

public class Lab085 {
    public static void main(String[] args) {
        //Little tricky interview question
        boolean a = true;
        int b = 10;
        a = !a;
        if(2+2 < 4) //a is created but not used here as a condition
        {
            System.out.println("Inside if condition");
        }
        System.out.println("Outside if condition. Value of a -> "+a);//outside loop will be executed always
        // Understand with debug -> checking the code line by line
        // add debugging points (add for conditions)
        //code will start to execute automatically as usual but stops at dubug point
        // and wait for us to give next step

    }
}
