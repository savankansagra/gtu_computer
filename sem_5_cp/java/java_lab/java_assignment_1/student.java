import java.util.*;

public class student {
    String rollno;
    String name;
    int marks[]=new int[5];
    int pass = 1;

    void getinfo(){
        System.out.print("\n\nthe details of student is here ::::");
        System.out.print("\nroll no :" + rollno);
        System.out.print("\n name :" + name);

        for(int i=0;i<5;i++) {
            System.out.print("\n marks[" + i + "]  = "+ marks[i]);
        }

        //for cpi is
        System.out.print(" \n the cpi is ::: "+ calCPI());


        if(pass == 1){
            System.out.print("\n PASS");
        }
        else
            System.out.print("\n FAIL");



    }

    void putinfo(){
        Scanner ob = new Scanner(System.in);

        System.out.print("\n enter the following details ::");
        System.out.print("\n rollno :");
        rollno = ob.next();

        System.out.print("\n name ::");
        name = ob.next();

        for(int i =0 ;i<5;i++) {
            System.out.print("\n marks in subject " + i);
            marks[i] = ob.nextInt();
        }
    }

    float calCPI(){
        float total=0;
        for(int i=0 ;i<5;i++){
            if(marks[i] < 35)
                pass = 0;
            total = total + marks[i];

        }
        return total/(float)35;
    }


    public static void main(String[] s) {
        student s1 = new student();

        s1.putinfo();
        s1.getinfo();
    }
}
