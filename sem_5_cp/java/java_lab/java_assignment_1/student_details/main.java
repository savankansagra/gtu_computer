/*Define class Student with following members
        Fields:
        String name
        long   enrollment_no
        float  marks_of_cpu, marks_of_ds, marks_of_algo, marks_of_java
        float percentage
        Functions:
        Student(String name, long   enrollment_no, float  marks_of_cpu, float marks_of_ds, float marks_of_algo , float marks_of_java)
        void  read_detail();
        float calculate_percentage( )
        void display_details( )
       // void display_specific(String  substring)
//above function display students details only if their name starts from substring or end with specify substring. For example display details of student whose surname is “Patel”.

*/




package student_details;

public class main {
    public static void main(String ard[]){
        Student s1 = new Student();
        s1.read_details();
        s1.display_details();
        s1.display_specific("savan");

    }

}
