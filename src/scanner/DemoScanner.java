package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {


        Scanner obj= new Scanner(System.in);// created object for Scanner class

        System.out.println("Please enter your Name : ");

        String name= obj.nextLine();
        System.out.println("You have entered name as : "+name);

        System.out.println("Please enter your ATM PIN : ");

        int pin= obj.nextInt();
        System.out.println("You have entered PIN : "+pin);

        System.out.println("Please enter your salary : ");

        double salary= obj.nextDouble();
        System.out.println("ypu have entered salary as "+salary);
    }
}
