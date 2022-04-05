package exeption_handeling;


public class DemoCustomException {


    public void doVoting(int age) throws AgeNotEligibleException{

        if(age<18){

            throw new AgeNotEligibleException("Age is less than 18 so not eligible for voting");
        }
        else {
            System.out.println("Welcome to Voting App....");
        }

    }


    public static void main(String[] args) {


        int age=17;

        DemoCustomException obj= new DemoCustomException();


        try {
            obj.doVoting(age);
        } catch (AgeNotEligibleException e) {
            e.printStackTrace();
        }


    }
}
