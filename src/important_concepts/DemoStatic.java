package important_concepts;

public  class DemoStatic {

    static int age=23;

    public static void hello(){

       System.out.println("This is STATIC HELLO Method...");
    }


    public static void main(String[] args) {

        // SYNTAX:  ClassName.MethodName();

        DemoStatic.hello();
        System.out.println(DemoStatic.age);
    }
}
