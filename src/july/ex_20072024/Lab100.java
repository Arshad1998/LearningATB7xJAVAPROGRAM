package july.ex_20072024;

public class Lab100 {
    public static void main(String[] args) {
        // JDK > 13 Switch can Return some values using yield and throw
        //Rarely used

        char code = 'B';
        int val = switch (code) //switch is returning a value and we are storing in int val
        {
            case 'A':
                yield 65;
            case 'B':
                yield 66;//// return

            default:
                throw new IllegalStateException("Unexpected value: " + code); //when we use yield default throw is needed compiler asks for it
        };

        System.out.println(val);
    }
}
