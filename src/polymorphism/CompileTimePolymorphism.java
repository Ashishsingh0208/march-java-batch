package polymorphism;

public class CompileTimePolymorphism {

    // method overloading:  WE WILL OVERLOAD SAME METHOD WITH DIFFERENT INPUT PARAMETER

   public void m1(){

       System.out.println("This is m1 method");
   }
   // overload m1

    public void m1(int a){

        System.out.println("This is  overloaded m1 method with single parameter");
    }
    // overload with two parameter
    public void m1(int a, String s){

        System.out.println("This is  overloaded m1 method with Two parameter");
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.m1();
        obj.m1(3);
        obj.m1(3,"Test");

    }

}
