
import java.util.Scanner;
class Demo_2{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size;
        System.out.println("How many books in the shop  :");
        size=obj.nextInt();
        Books book[]=new Books[size];
        for(int i=0;i<size;i++) {
            System.out.println("Please enter author name,title,publisher and price of book :");
            String a=obj.next();
            String b=obj.next();
            String c=obj.next();
            int d=obj.nextInt();
            book[i]=new Books();
            book[i].add_books(a,b,c,d);
        }

        //Searching a book;
        for(int i=0;i<size;i++){
            int temp;
            temp=book[i].search("abcd","savan");
            if(temp==1)
                break;
        }
    }
}

class Books{
    String author,title,publisher;
    int price,stock_position=0;
    static int transaction_sucess=0,transaction_fail=0;
    void add_books(String author,String title,String publisher,int price){
        Scanner obj =new Scanner(System.in);
        this.author=author;
        this.title=title;
        this.publisher=publisher;
        this.price=price;
        System.out.println("How many copies of the book: "+title+" ?");
        stock_position=obj.nextInt();
    }

    int search(String title,String author){
        Scanner obj =new Scanner(System.in);
        if(title.equals(this.title) || title.equals(this.author)){
            System.out.println("There book does exist and the price is :" + price);
            System.out.println("Will you like to buy this book? (y or n)");
            String choice=obj.next();
            if(choice.equals("y")) {
                System.out.println("Please wait till I check the available copies");
                check_availability();
            }
            return 1;
        }
        else {
            System.out.println("Sorry the book isn't available");
            return 0;
        }

    }

    void check_availability(){
        if (stock_position != 0){
            stock_position -= 1;
            System.out.println("Required copies of the book is available");
            transaction_sucess++;
        }
        else {
            System.out.println("Required copies not in stock");
            transaction_fail++;
        }
    }
}