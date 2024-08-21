package august.ex_17082024.WrapperClass;

public class Lab199 {

    public static void main(String[] args) {
//      Real time usage of SIB and IIB in Automation

        APIAutomation a = new APIAutomation();
        // SIB - call 1 time when class is loaded
        // IIB - when object is created.
    }
}

class APIAutomation{

    static {
        // write a code to load the data from the MySQL
        System.out.println("Loaded data from the MYSQL");
    }

    {
        // write a code to load the data from the CSV file
        System.out.println("Loaded data from the CSV");

    }


}
