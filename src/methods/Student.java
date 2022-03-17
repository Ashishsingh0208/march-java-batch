package methods;

public class Student {


    //Syntax : access_specifier return_type  method_name (parameter) {CODE}
    public void read(){

        System.out.println("This is read Method ");
    }

    public void play (){

        System.out.println("This is Play Method ...");
    }



    public static void main(String[] args) {

        Student obj= new Student();
        obj.read();
        obj.play();
    }
}
