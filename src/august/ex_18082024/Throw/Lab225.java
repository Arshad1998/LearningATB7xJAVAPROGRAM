package august.ex_18082024.Throw;

public class Lab225 {
    public static void main(String[] args) {
        String s1 = null;

        if (s1 == null)
        {
            try {
                throw new Exception("String value is Null!!!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        s1.trim(); //it'll remove all leading and trailing zeros

    }
}
