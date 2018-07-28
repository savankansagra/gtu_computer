/*Define a class Matrix with following
Field:
         int row, column;
         float mat[][]

Function:
         Matrix(int a[][]);
         Matrix();
         void readMatrix()                                   //read element of first array

         float [][] transpose( )                             //find transpose of first matrix
         float [][] matrixMultiplication(Matrix second  ) //multiply two matrices and return result
         void displayMatrix(float [][]a)              //display content of argument  array
         void displayMatrix()                                //display contne
         void displayAnswerMatrix(float [][]a) // display content of answer array
         int maximum_of_array()                       // return maximum element of first array
         int  average_of_array( )                         // return average of first array

create object of Matrix class in main and test  all the functions in main


*/

import java.util.*;

public class Matrix {
    int row, column;
    float mat[][];
    Scanner ob = new Scanner(System.in);

    Matrix(){
        mat = new float[3][3];

    }


    Matrix(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                mat[i][j] = a[i][j];
            }
        }
    }

    void readMatrix(){
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = ob.nextInt();
            }
        }
    }

    float [][] transpose(){
        float temp_1;

        Matrix temp = new Matrix();
        temp.mat = this.mat.clone();
        for(int i=0;i<temp.mat.length;i++){
            for(int j=i;j<temp.mat[i].length;j++){
                temp_1 = temp.mat[i][j];
                temp.mat[i][j]= temp.mat[j][i];
                temp.mat[j][i] = temp_1;
            }
        }

        return temp.mat;
    }

    float [][] matrixMultiplication(Matrix second){
        float temp_2 [][] = new float[this.mat.length][this.mat.length];

        for(int i=0;i<this.mat.length;i++){
            for(int j=0;j<this.mat.length;j++){
                float ans=0;
                for(int k=0;k<this.mat.length;k++){
                    ans = ans + this.mat[i][k]*second.mat[k][j];
                }
                temp_2[i][j] = ans;
            }
        }
        return temp_2;
    }

    void displayMatrix(float a[][]){
        System.out.println("\n\n");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }

    void displayMatrix(){
        displayMatrix(this.mat);
    }

    int maximum_of_array(){
        float max = mat[0][0];

        for(int i=0;i<this.mat.length;i++){
            for(int j=0;j<this.mat.length;j++){
                if(max < this.mat[i][j]){
                    max = mat[i][j];
                }
            }
        }
        return (int)max;
    }

    int  average_of_array( ){
        float sum = 0;

        int i;
        int j=0;
        for(i=0;i<this.mat.length;i++){
            for(j=0;j<this.mat.length;j++){
                sum += mat[i][j];
            }
        }

        return (int)(sum/(i+j+2));

    }


    public static void main(String arg[]){

        Matrix m1 = new Matrix();
        m1.readMatrix();

        Matrix m2 = new Matrix();
        m2.readMatrix();

        m2.mat = m1.transpose();

        float answer[][] = new float[3][3];


        answer = m1.matrixMultiplication(m2);

        m1.displayMatrix(answer);



        System.out.println("\n\t maximum is : " + m1.maximum_of_array());
        System.out.print("\n\t average of matrix is :"+ m1.average_of_array());



    }

}
