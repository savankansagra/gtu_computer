/*8.		Define a class Array with following member
        Field:
        int data[];
        Function:
        Array( )                                          //create array data of size 10
        Array(int size)                              // create array of size size
        Array(int data[])                         // initialize array with parameter array
        void Reverse _an _array ()     //reverse element of an array
        int Maximum _of _array ()     // find  maximum element of array
        int Average_of _array()          //find average of  element of array
        void Sorting ()                        //sort element of array
        void display()                       //display element of array
        int search(int no)               //search element and return index else  return -1
        int size();                           //return size of an array
*/



public class Array {
    int data[];

    Array(){
        data = new int[10];
    }

    Array(int size){
        data = new int[size];
    }

    Array(int data[]){
        this.data = data;
    }

    void Reverse_an_array (){
        int temp;
        for(int i=0;i<data.length/2;i++){
            temp = data[i];
            data[i] = data[data.length-i];
            data[data.length-i]=temp;
        }
    }

    int Maximum_of_array (){
        int max=data[0];
        for(int i=1;i<data.length;i++){
            if(max>data[i]){
                max = data[i];
            }
        }
        return max;
    }

    int Average_of_array(){
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum = sum + data[i];
        }
        return sum/data.length;
    }

    void Sorting (){

        for(int i =0;i<data.length;i++){
            int min = data[i];
            for(int j=i+1;j<data.length;j++){

                if(min > data[j]){
                    data[i] = data[j];
                    data[j] = min;
                    min = data[i];
                }

            }
        }

    }

    void display(){
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

    int search(int no){
        for(int i=0;i<data.length;i++){
            if(no == data[i]){
                return i;
            }
        }
        return -1;
    }



    int size(){
        return data.length;
    }

}
