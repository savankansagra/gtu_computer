/*Define a class with the Name, Basic salary and dearness allowance as data members.
Calculate and print the Name, Basic salary(yearly), dearness allowance and tax deduced at source(TDS) and net salary,
    where TDS is charged on gross salary
    which is basic salary + dearness allowance and TDS rate is as per following table.
Gross Salary	            TDS
Rs. 100000 and below	    NIL
Above Rs. 100000	        10% on excess over 100000

DA is 74% of Basic Salary for all
Use appropriate member function.
*/

import java.util.Scanner;

public class salary {
    String name;
    int basic_Salary;
    double d_a;

    void Calculate_Salary()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("name :");
        name = ob.next();

        System.out.print("\n basic salary :");
        basic_Salary = ob.nextInt();

        d_a = basic_Salary * 0.74;

    }

    double tda()
    {
        if(basic_Salary + d_a < 100000){
            return 0;
        }
        else{
            return (basic_Salary + d_a - 100000) * 0.10;
        }
    }

    double net_Salary(){
        return basic_Salary + d_a - tda();
    }


    void display(){

        Calculate_Salary();

        System.out.print("name :" + name + "\t Basic salary yearly :" + basic_Salary + "\t Dearness allowance :"+
            d_a + "\t TDA :" + tda() + "\tnet_salary :" +net_Salary());

    }

    public static void main(String arg[]){
        salary sala1 = new salary();
        sala1.display();
    }

}
