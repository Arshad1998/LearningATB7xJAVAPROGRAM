package august.ex_04082024.Relationships.Inheritance.MultiLevelInheritance;

public class Son extends Father{

    String S_name = "Arshad";
    String F_name = "Amaan";

    void S_Calling()
    {
        System.out.println("Son's name is ->" + S_name +'\t' +F_name +'\t' +GF_Name);
        //Son was able to use both Father and Grandfather's variable

//        F_Calling();
/*       We can call the function of parent class
         without using reference inside the function of child class*/

/*       when S.S_calling called from main function
               F_Calling is called from within Child using the current instance (this), which implicitly
                       refers to the child instance.

                       it'll be like s.S_Calling.F_Calling      that's why ref not needed explicitly
                       */
    }



}
