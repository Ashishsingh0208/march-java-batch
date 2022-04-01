package polymorphism;

public class Child extends RuntimePolyMorphism{

    public void m1(){

        System.out.println("****This is m1 from CHILD class");
    }


    public static void main(String[] args) {


        Child obj = new Child();
        //obj.m1();
        // runtime polymorphism
// Q1:
        RuntimePolyMorphism parent= new RuntimePolyMorphism();
        parent.m1();// CALL PARENT M1
//Q2
        RuntimePolyMorphism parent1= new Child();
        parent1.m1();// CALL CHILD M1

//Q3   : COMPLIE TIME ERROR : we can not assing parent object to Child reference variable
      /*  Child child= new RuntimePolyMorphism();*/


    }
}
