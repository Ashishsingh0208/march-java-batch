package methods;

import java.util.Scanner;

public class Calculator {

    public int addition(int a, int b){

        int result= a+b;

        return result;
    }
    public int subtraction(int a, int b){

        int result= a-b;

        return result;
    }
    public int multi(int a, int b){

        int result= a*b;

        return result;
    }
    public int divide(int a, int b){

        int result= a/b;

        return result;
    }




    public static void main(String args[]){

        Scanner scanner= new Scanner(System.in);

        Calculator obj= new Calculator();

   int flag=1;

        while (flag==1) {
            System.out.println("Welcome ot Calculator App , Please enter your choice ");
            int choice = scanner.nextInt();

            System.out.println("1 for Addition , 2 for Subtraction , 3 for multiply , 4 for divide");
            System.out.println("Please enter value of a:");
            int a = scanner.nextInt();
            System.out.println("Please enter value of b:");
            int b = scanner.nextInt();

            int result;

            if (choice == 1) {
                result = obj.addition(a, b);
                System.out.println("ADDITION of a and b is :" + result);
            } else if (choice == 2) {

                result = obj.subtraction(a, b);
                System.out.println("SUBTRACTION  of a and b is :" + result);
            } else if (choice == 3) {

                result = obj.multi(a, b);
                System.out.println("MULTI  of a and b is :" + result);
            } else {
                result = obj.divide(a, b);
                System.out.println("DIVIDE  of a and b is :" + result);

            }

            Scanner scanner1= new Scanner(System.in);
            System.out.println(" press Y to EXIT or press N to continue");
            String input= scanner1.nextLine();
            if(input.equals("Y")){
                flag=0;
            }
        }

    }
}
