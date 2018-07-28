import java.util.*;


class Car {
    int  model;
    String name;
    String colour;
    float cost;
    static int index = 0;
    Scanner ob = new Scanner(System.in);

    void getCarDetails(){
        System.out.print("\nenter following details for car ::");
        System.out.print("\n model ::");
         model = ob.nextInt();
        System.out.print("\n name ::");
        name = ob.next();
        System.out.print("\n colour ::");
        colour = ob.next();
        System.out.print("\n cost");
        cost = ob.nextFloat();
    }


    void showCarDetails(){
        index++;
        System.out.print(" \n\n  :: ");
        if(index == 1) {
            System.out.print(" model \t name \t colour \t cost ");
        }
        System.out.print("\n "+model+" \t" +  name +" \t " + colour + " \t " + cost );

    }


    public static void main(String[] s1){
        Car ca[] = new Car[3];
        for(int i=0;i<ca.length;i++){
            ca[i] = new Car();
        }

        for(int i=0;i<3;i++){
            ca[i].getCarDetails();
        }

        for(int j=0;j<3;j++){
            ca[j].showCarDetails();
        }
    }
}
