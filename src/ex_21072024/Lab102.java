package ex_21072024;

public class Lab102 {
    public static void main(String[] args) {

//        Exercise to show switch accept -1 as well
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");
                break;
        }


    }
}
