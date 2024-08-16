package august.ex_10082024.Encapsulation;

class VMOLogin{
    public static void main(String[] args) {

        VMOWebsite VMO = new VMOWebsite();

        VMO.setUsername("Arshad");
        System.out.println(VMO.getUsername());

//        VMO Don't have access for remaining

//        VMO.getPassword();
//        VMO.getSignINButton();

        VMO.getPassword();
        VMO.getSignINButton();

    }
}

class VMOWebsite {
    private String username;
    private String password;
    private String signINButton;

    public String getPassword() {
        return password;
    }

    public String getSignINButton() {
        return signINButton;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


/*        Encapsulation final understanding

          • Use Setter and Getter with Condition to secure your data members by methods
          •	Getter -> Fetch the data member - secure this also
          •	Setter - Update the value -> secure this also (based on the condition)
          •	Web Automation - Page Class
          •	API Automaton - Pojo Class


          •	Advantage of Encapsulation
              o	Data Hiding
              o	Increased Flexibility: You can make the variables of the class read-only or write-only depending on your requirements.
              o	Security

 */