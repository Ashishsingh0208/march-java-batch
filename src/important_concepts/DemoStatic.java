package important_concepts;

public  class DemoStatic {

    static int age=23;
    String name="JAVA";

    public static void hello(){
      // System.out.println(name);// WE CAN NOT USE NON STATIC DATA AS IT IS PART OF OBJECT
       System.out.println("This is STATIC HELLO Method...");
    }

    // overloading of static method
    public static void hello(int age){
        // System.out.println(name);// WE CAN NOT USE NON STATIC DATA AS IT IS PART OF OBJECT
        System.out.println("This is STATIC HELLO Method...");
    }


    public static void main(String[] args) {

        // SYNTAX:  ClassName.MethodName();

        DemoStatic.hello();
        System.out.println(DemoStatic.age);
    }
}
