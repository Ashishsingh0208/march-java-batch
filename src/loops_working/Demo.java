package loops_working;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Hello ...");
        System.out.println("Hello ...");
        System.out.println("Hello ...");
        System.out.println("Hello ...");
        System.out.println("Hello ...");

        // SYNTAX : for(initillization ;    condition;  increment/decrement){
        ////                    code to be executed
        //              }
        // INCREMENT LOOP
        for (int i=0; i<10; i++ ){

            System.out.println("Hello from INCREMENT LOOP : "+i );
        }

        // DECREMENT LOOP
        for (int i= 5; i>0 ; i--){

            System.out.println("Hello From DECREMENT LOOP : " +i);
        }

    }
}
