package methods;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // create Object of Scanner class

        Scanner obj= new Scanner(System.in);

        // String Input
        System.out.println("Please Enter your Name : ");

        String name= obj.nextLine();// read String Input

        System.out.println("You have entered name as "+name);

        //int input
        System.out.println("Please Enter your AGE : ");

        int age= obj.nextInt();// reads int input
        System.out.println("You have entered AGE as "+age);

        // double input
        System.out.println("Please Enter your SALARY : ");
        double salary= obj.nextDouble();// reads double input
        System.out.println("You have entered SALARY as "+salary);

    }
}
