package loops_working;

public class DemoWhile {

    public static void main(String[] args) {


        // SYNTAX   while (CONDITION) { CODE }

        int i=0;

        while (i<10){

            System.out.println("While Loop : " +i);
            i++;
        }

        i=10;

        while (i>0){

            System.out.println(" Decrement While Loop : " +i);
            i--;
        }


       // DO WHILE LOOP :  do {code } while(condition);

        int j=0;
        do {
            System.out.println("Increment DO WHILE LOOP: "+j);
            j++;
        }
        while (j<10);

        j=10;

        do {
            System.out.println("Decrement DO WHILE LOOP: "+j);

            j--;
        }while (j>0);


    }
}
