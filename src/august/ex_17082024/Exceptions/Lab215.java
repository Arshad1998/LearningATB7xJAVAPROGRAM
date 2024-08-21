package august.ex_17082024.Exceptions;

public class Lab215 {

    public static void main(String[] amit) {

        try {
            int a = 10/0;
        }
        catch (Exception e)
//      We can use any of the below statement bcoz every class is connected using inheritance
//        catch (Throwable e)
//        catch (Error e)
//      catch(ArithmeticException e)
        {
            System.out.println("Div by Zero");
            //e.getMessage()
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }
    }
}
