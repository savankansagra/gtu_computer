/*Define class Student with following members
        Fields:
        String name
        long   enrollment_no
        float  marks_of_cpu, marks_of_ds, marks_of_algo, marks_of_java
        float percentage
      =  Functions:
        =Student(String name, long   enrollment_no, float  marks_of_cpu, float marks_of_ds, float marks_of_algo , float marks_of_java)
       = void  read_detail();
        float calculate_percentage( )
        void display_details( )
        // void display_specific(String  substring)
//above function display students details only if their name starts from substring or end with specify substring. For example display details of student whose surname is “Patel”.

*/



package student_details;
import java.util.Scanner;

class Student{
    String name;
    long enrollment_no;

    float marks_of_cpu , marks_of_ds, marks_of_algo , marks_of_java;
    float percentage;
    public Scanner scanner = new Scanner(System.in);

    Student(){
        ;
    }

    Student(String name,long enrollment_no , float marks_of_cpu , float marks_of_ds , float marks_of_algo ,float marks_of_java){
        this.name = name ;
        this.enrollment_no = enrollment_no ;
        this.marks_of_cpu = marks_of_cpu ;
        this.marks_of_ds = marks_of_ds ;
        this.marks_of_algo = marks_of_algo ;
        this.marks_of_java = marks_of_java;
      }

    void read_details()
    {
        System.out.print("\n name :");
        name = scanner.next();
        System.out.print("\n enrollment_no :");
        enrollment_no = scanner.nextLong();
        System.out.println("\n marks_of_cpu :");
        marks_of_cpu = scanner.nextFloat();
        System.out.println("\n marks_of_ds :");
        marks_of_ds = scanner.nextFloat();
        System.out.println("\n marks_of_algo :");
        marks_of_algo = scanner.nextFloat();
        System.out.println("\n marks_of_java :");
        marks_of_java = scanner.nextFloat();


    }

    float calculate_percentage(){
        return (marks_of_java+marks_of_ds+marks_of_algo+marks_of_cpu)/4;
    }

    void display_details( ){
        System.out.println("name :" + name);
        System.out.println("enrollment_no :" + enrollment_no);
        System.out.println("marks of cpu :" + marks_of_cpu);
        System.out.println("marks of ds :" + marks_of_ds);
        System.out.println("marks of algo :" + marks_of_algo);
        System.out.println("marks of java :" + marks_of_java);
        System.out.println("the percentage is :" + calculate_percentage());
    }

    void display_specific(String substring){
        String surname;
        surname = name.substring(name.indexOf(" ")+1);
        if(surname.equals(substring) || surname.equals(substring)){
            this.display_details();
        }
        else
        {
            System.out.println("the string not found please try again::");
        }

    }
}
