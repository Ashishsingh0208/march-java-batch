package methods;

public class MethodReturnType {


    //access_specifier return_type(Datatype)  method_name (parameter) {CODE}

    public String message(String name){

     String message= name+ " Welcome to Java ";

     return message;
    }

    public int checkAge(){
        int age= 23;
        return age;
    }

    public double getSalary(){

        double salary=455656.5;

        return salary;
    }
    public static void main(String[] args) {

        MethodReturnType obj= new MethodReturnType();
        String output=obj.message("Mohit");

        System.out.println("output is "+output);

       int age= obj.checkAge();

       System.out.println("Age is "+age);
       double salary =obj.getSalary();
       System.out.println("Salary is "+salary);
    }

}
