package methods;

public class CalculatorApp {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE}


    //add
    public void addition(){

        System.out.println("This is Add method of calculator class");
        int a=3;
        int b=35;

        int output= a+b;
        System.out.println("Output is : " +output);

    }

    //sub= a-b
    //multi

    public void multiplication(){
        System.out.println("This is Multiplication method of Calculator");
        int a=5;
        int b=3;

        int output= a*b;
        System.out.println("Output is : " +output);
    }
    //divide = a/b;

    public static void main(String[] args) {
        CalculatorApp obj= new CalculatorApp();
        obj.addition();
        obj.multiplication();
    }

}
