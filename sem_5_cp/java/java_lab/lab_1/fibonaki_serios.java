package lab_program.lab_1;

public class fibonaki_serios {
    static void fibonaki(int n){
        int a=0,b=1;
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            sum = a+b;
            a=b;
            b=sum;
        }
    }

   public static void main(String args[]){
        fibonaki(10);
    }

}
