package august.ex_04082024.Relationships.Inheritance.MultiLevelInheritance;

public class Father extends GrandFather {

    String F_name = "Amanullah";

    void F_Calling()
    {
        System.out.println("Father's name is ->" +F_name + '\t' + GF_Name);
        //Father was able to use Grandfather's variable

    }



}
