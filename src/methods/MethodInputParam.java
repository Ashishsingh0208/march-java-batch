package methods;

public class MethodInputParam {

    //Syntax : access_specifier return_type  method_name (Datatype varname, Datatype name..)
    // {CODE}

    public void message(String name){

        System.out.println("Hello This is Java " +name);
    }


    public void checkAge(int age){

        if (age>18){
            System.out.println("Person is eligible for voting");
        }
        else
        {
            System.out.println("Not Eligible for voting");
        }
    }

    public void salary(double salary){

        System.out.println("Yur salary is "+salary);
    }

    public void Hello(String name , int age){

        System.out.println("You have entered Name "+name +" and age "+age);
    }

    public static void main(String[] args) {
        MethodInputParam obj= new MethodInputParam();
        obj.message("Ramesh");

        obj.checkAge(19);
        obj.salary(34324.67);
        obj.Hello("Rahul",25);
    }

}
