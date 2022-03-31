package abstraction;

public abstract class DemoAbstract {

    // ABSTRACT CLASS PROVIDES PARTIAL ABSTRACTION ?

    public abstract void m1();//abstract method

    public void m2(){

        System.out.println("This is Normal method and shared with All");
    }

    // WE CAN NOT CREATE OBJECT OF ABSTRACT CLASS ?

    public static void main(String[] args) {

        /*DemoAbstract obj = new DemoAbstract();
         obj.m1();*/
    }

}
