package july.ex_27072024;

import java.util.Scanner;

public class Lab147 {

    public static void main(String[] args) {

    //Find the maximum salary in the array - Infosys Automation interview questions

//    int[] salary = {10, 7, 35, 18, 12, 5};
    int[] salary = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of salaries");
    for (int i=0; i< salary.length; i++)
    {
        salary[i]= sc.nextInt();
    }

    int max = salary[0];
    int min = salary[0];
        System.out.println("\nThe list of salaries provided are");
    for(int i=0; i < salary.length ; i++)
    {
        System.out.println(salary[i] + " ");
        if(salary[i]>max)
        {
            max=salary[i];
        }
        if(salary[i]<min)
        {
            min=salary[i];
        }
    }

        System.out.println();
    System.out.println("Highest salary is -> " +max);
    System.out.println("Lowest salary is -> " +min);

        // same prog using functions -> Sort and find the last one but not suggested
//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);
    }

}
