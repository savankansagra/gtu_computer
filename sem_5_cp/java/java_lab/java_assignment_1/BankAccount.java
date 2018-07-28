import java.util.Scanner;

public class BankAccount {
    private String deposite_name;
    long Acc_no;
    static long count_acc = 1;
    String Acc_type;
    private long Balance;
    Scanner ob = new Scanner(System.in);


    void createAcc(){
        System.out.print("\nEnter following details ::");
        System.out.print("\n Depositer name :");
        deposite_name = ob.next();

        Acc_no = count_acc++;

        System.out.print("\nDepositer account number is ::"+Acc_no);

        System.out.print("\nYour account type ::");
        Acc_type = ob.next();

        System.out.print("\nDeposliter Initial Balance :: ");
        Balance = ob.nextLong();

    }

    void Deposite(){
        System.out.print("\n Deposite amount ::");
        Balance  = Balance + ob.nextLong();
        System.out.print(" new balance is ::" + Balance);
    }

    void withdraw(){
        long withdraw;
        System.out.print("\n withdraw amount ::");
        withdraw = ob.nextLong();

        if(withdraw >  this.Balance){
            System.out.print("\n\n sorry your account balance is low:::::\n please deposite money to use services :::");
        }
        else
        {
            Balance = Balance - withdraw;
            System.out.print(" new balance is ::" + Balance);
        }
    }

    void BalanceInquiry(){
        System.out.print("Balance is :: "+Balance);
    }

    long return_acc_no(){
        return Acc_no;
    }


}

class Demo
{

    static int index=0;
    public static void main(String s[]){
        Scanner ob = new Scanner(System.in);
        int choice;


        BankAccount acc[] = new BankAccount[100];


        do {
            System.out.print("\n\n\nenter the choice ::");
            System.out.print("\n 1.create Account \n2.deposit \n3.withdraw \n4.balance inquiry\n 5. exit");
            choice = ob.nextInt();
            long temp=0;

            switch (choice) {
                case 1:
                    acc[index] = new BankAccount();
                    acc[index].createAcc();
                    index++;
                    break;

                case 2:

                    System.out.print("enter account number ::");
                    temp = ob.nextLong();

                  /*  for (int i = 0; i < acc.length; i++) {
                        if (temp == acc[i].return_acc_no()) {
                            temp = i;
                        }
                    }
                  */
                    acc[(int) temp-1].Deposite();
                    break;

                case 3:

                    System.out.print("enter account number ::");
                    temp = ob.nextLong();

                    /*
                    for (int i = 0; i < acc.length; i++) {
                        if (temp == acc[i].return_acc_no()) {
                            temp = i;
                        }
                    }*/

                    acc[(int)temp -1].withdraw();
                    break;

                case 4:

                    System.out.print("enter account number ::");
                    temp = ob.nextLong();

                    /*for (int i = 0; i < acc.length; i++) {
                        if (temp == acc[i].return_acc_no()) {
                            temp = i;
                        }
                    }*/

                    acc[(int) temp-1].BalanceInquiry();
                    break;

            }
        }
        while(choice != 5);
    }
}
