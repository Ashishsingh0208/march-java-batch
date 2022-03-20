package methods;

public class CalculatoInput {

    public void addition(int a, int b){

        int output= a+b;

        System.out.println("Addition is "+output);
    }


    public static void main(String[] args) {

        CalculatoInput obj = new CalculatoInput();

        obj.addition(324,7);
    }
}
