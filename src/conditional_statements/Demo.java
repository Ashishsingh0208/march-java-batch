package conditional_statements;

public class Demo {

    public static void main(String[] args) {

        //SYNTAX: if (CONDITION)

         int age=19;

         if(age==17){

             System.out.println("YOu age is 17 and your are not eligible for voting");
         }
         else{
             System.out.println("you age is above 17");
         }


         if(age<18){

             System.out.println("Person is child");
         }
         else {
             System.out.println("Person is Young");
         }

         if (age>18){

             System.out.println("eligible for Voting");
         }
         else {
             System.out.println("eligible for Voting");
         }


         String city="AGRA";

         if (city=="AGRA"){

             System.out.println("You are in AGRA");
         }
         else {
             System.out.println("You are in AGRA");
         }

    }

}
