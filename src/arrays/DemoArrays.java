package arrays;

public class DemoArrays {

    public static void main(String[] args) {

// SYNTAX  Datatype var_ame [] = {value1, value2,.....};

        String name1="Java";
        String name2="Spring ";
        String name3="Spring Boot";

        String names[]= {"Java","Spring","Spring Boot", "Cloud"};


        System.out.println("Printing Array: "+ names[0]);
        System.out.println("Printing Array: "+ names[1]);
        System.out.println("Printing Array: "+ names[2]);
        System.out.println("Printing Array: "+ names[3]);

        for (int i=0; i < names.length; i++){

            System.out.println("FOR LOOP "+ names[i]);
        }

        // Advance for loop   SYNTAX  for (Datatype var_name : Array/Collection){}

        for(String var: names){

            System.out.println("Printing inside ADVANCED FOR LOOP: "+ var);
        }


        int marks[]= {45,55,44,76,87,45,43,67};

        for(int var: marks){

            System.out.println("Printing Marks array "+var);
        }


        double prices[]={23.43,456.33,53.4,55.6,34.33};

        for(double var : prices){
            System.out.println("Printing Prices Array "+var);
        }
    }
}
