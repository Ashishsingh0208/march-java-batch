package conditional_statements;

public class Day2IfandElse {

    public static void main(String[] args) {

        int age=21;
        String city="AGRA";

        // write a code which will check age should be greater 18 and city AGRA for voting App in AGRA

        if(age>18){

            System.out.println("Eligible for Voting..");
        }
        if(city=="AGRA"){

            System.out.println("City is Agra..");
        }

        //multiple condition
        //TRUE & TRUE= TRUE (1X1=1)
        if(age>18 && city=="AGRA"){
           System.out.println("Eligible for voting in Agra TRUE & TRUE= TRUE (1X1=1)");
        }
        //TRUE & FALSE=FALSE(1X0=0)
        city="DELHI";
        if(age>18 && city=="AGRA"){
            System.out.println("Eligible for voting in Agra TRUE & TRUE= TRUE (1X1=1)");
        }else {
            System.out.println("Not eligible for voting in Agra : TRUE & FALSE=FALSE(1X0=0)");
        }

       // FALSE& TRUE =FALSE(0X1=0)
      age=17; city="AGRA";

        if(age>18 && city=="AGRA"){
            System.out.println("Eligible for voting in Agra TRUE & TRUE= TRUE (1X1=1)");
        }else {
            System.out.println("Not eligible for voting in Agra : FALSE& TRUE =FALSE(0X1=0)");
        }
// FALSE&FALSE= FALSE(0X0=0)
      age=18; city="PUNE";
        if(age>18 && city=="AGRA"){
            System.out.println("Eligible for voting in Agra TRUE & TRUE= TRUE (1X1=1)");
        }else {
            System.out.println("Not eligible for voting in Agra : FALSE&FALSE= FALSE(0X0=0)");
        }

    //OR OPERATOR : TRUE||TRUE= TRUE (1+1=1)
    age=21; city="AGRA";
        if(age>18 || city=="AGRA"){
            System.out.println("Eligible for voting in Agra : OR OPERATOR : TRUE||TRUE= TRUE (1+1=1)");
        }else {
            System.out.println("Not eligible for voting in Agra : //OR OPERATOR : TRUE||TRUE= TRUE (1+1=1)");
        }

        //OR OPERATOR:TRUE||FALSE=TRUE (1+0=1)
        age=21; city="DELHI";
        if(age>18 || city=="AGRA"){
            System.out.println("Eligible for voting in Agra : OR OPERATOR:TRUE||FALSE=TRUE (1+0=1)");
        }else {
            System.out.println("Not eligible for voting in Agra : OR OPERATOR:TRUE||FALSE=TRUE (1+0=1)");
        }

        //OR OPERATOR: FALSE ||TRUE=TRUE (0+1=1)
        age=17; city="AGRA";
        if(age>18 || city=="AGRA"){
            System.out.println("Eligible for voting in Agra : OR OPERATOR: FALSE ||TRUE=TRUE (0+1=1)");
        }else {
            System.out.println("Not eligible for voting in Agra : OR OPERATOR: FALSE ||TRUE=TRUE (0+1=1)");
        }

        //OR OPERATOR: FALSE ||FALSE =FALSE (0+0=0)
        age=7; city="PUNE";
        if(age>18 || city=="AGRA"){
            System.out.println("Eligible for voting in Agra : OR OPERATOR: FALSE ||FALSE =FALSE (0+0=0)");
        }else {
            System.out.println("Not eligible for voting in Agra : OR OPERATOR: FALSE ||FALSE =FALSE (0+0=0)");
        }

        // NOT OPERATOR

        age=18;

        if(!(age==18)){
            System.out.println("AGE IS 18");
        }
        else {
            System.out.println("AGE IS NOT 18");
        }

    }
}
