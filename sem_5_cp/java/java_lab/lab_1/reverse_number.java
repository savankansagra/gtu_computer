package lab_program.lab_1;

public class reverse_number {
    //private int number=0;

    static long reverse_num(long number){
        long temp =0 ;

        while(number != 0){
            temp = temp*10 + number % 10;
            number = number / 10;
            //temp = temp * 10;
        }

        return temp;
    }


    public static void main(String[] args){
        long ans = reverse_num(123456789);

        System.out.print("the reverse number is :"+ans);

    }

}
