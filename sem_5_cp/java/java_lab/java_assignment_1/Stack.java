/*7.		Define a class Stack with following members
        Fields:
        double  array[];
        int size
        Function:
        Stack(int size)
        void push(double no)
        boolean isEmpty( )
        double pop( )
*/



public class Stack{
    double  array[];
    int size;
    int top = -1 ;

    Stack(int size){
        this.size =size;
        array = new double[size];
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else
            return false;
    }

    void push(double no){
        top++;
        if(size == top-1){
            System.out.print("the stack is full");
        }
        else
            array[top] = no;
    }

    double pop(){
        if(isEmpty()){

            System.out.println("\n the stack in underflow ");
            return 0;
        }
        else{
            top --;
            return array[top+1];
        }
    }

    public static void main(String arg[]){
        Stack s1 = new Stack(10);
        s1.push(17);
        s1.push(78.98);
        System.out.print(s1.pop() +"\n"+s1.pop() +  "\n" + s1.pop() + "\n" + s1.pop() );
    }

}
