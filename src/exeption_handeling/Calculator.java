package exeption_handeling;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;

public class Calculator {

    public void divide (int a, int b){

        int result=0;
        System.out.println("*****Before division");
        try {
             result= a/b;
           }
        catch (Exception e){
            System.out.println("Exception occured and Catch so value of result will be Zero");
        }

   finally {
            System.out.println("FINALLY BLOCK EXECUTION ");

        }
        System.out.println("****After division");
        System.out.println("Division of a and b is  : "+result);


    }

    public void printArray(int arr[]){

        System.out.println("*** Before Print ");
        try {
            System.out.println("Printing 4th element of array :"+arr[3]);// 0,1,2,3
        }

        catch (Exception e){

            System.out.println("Exception Occured ....");
        }


        System.out.println("*** after Print ");
    }


    public static void main(String[] args) {

        Calculator calculator= new Calculator();
        calculator.divide(10,0);

        int [] arr= {2,3,9};//0,1,2
        calculator.printArray(arr);
    }
}
