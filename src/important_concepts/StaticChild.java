package important_concepts;

public class StaticChild extends  DemoStatic{

    public static void hello(){

        System.out.println("CHILD Class This is STATIC HELLO Method...");
    }

    public static void main(String[] args) {

        StaticChild.hello();
    }
}
