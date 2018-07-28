/**Define a class Sales with the name and sales of salesman as data members.
 * Calculate and print the Name, sales and commission, where commission id Rs .10 per 1000,
 * if sales are at lease Rs. 25000 of more and Rs. 5 otherwise.
 * Use appropriate member function.**/



class Sales {
    String name;
    long sales;
    double commission;

    Sales()
    {
        name = "not_known";
        sales = 0;
    }

    Sales(String name,long sales)
    {
        this.name = name;
        this.sales = sales;
    }

    double commission(){
        if(sales < 25000){
            return sales*5/1000;
        }
        else{
            return (sales*5/1000 )+(sales * 0.10 / 1000);
        }
    }

    void display(){
        System.out.print("the details of salesman is ::");
        System.out.print("\n Name : " + name + "\t sales : " + sales + "\t commission : " + commission());

    }


    public static void main(String[] args) {
        Sales s1 ;
        s1 = new Sales("abcde",10000);
        s1.display();
    }
}