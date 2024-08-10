package july.ex_21072024;

public class Lab112 {
    public static void main(String[] args) {
        final boolean b1 = true;
        // b1 = false; we can't change b1 to false since it is fixed bcoz of final

//        infinite loops
//        for (int i=0;b1;i++){
//            System.out.println("Hello");
//        }

//        for (int i=0;;){
//            System.out.println("Hello");
//        }

//        for (;;){
//            System.out.println("Hello");
//        }

        //For loop using float
        for(float f=0.0f;f<10.67;f++){
            System.out.println("Hi,Float -> "+ f);
        }

//        here 10 is considered bcoz 10,10.67
        for(byte f=0;f<10.67;f++){
            System.out.println("Hi,Float -> "+ f);
        }
//     For Loop with starting value as float
        for(float f=-10.67f;f<0.0;f++){
            System.out.println("Hi,Float -> "+ f);
        }

    }
}
