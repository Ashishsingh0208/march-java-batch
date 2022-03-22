package methods;

public class CalculatorReturnType {

    public int addition(int a, int b){

        int result=a+b;

        return result;
    }

    public static void main(String[] args) {
        CalculatorReturnType obj= new CalculatorReturnType();

      int result=  obj.addition(4,5);
      System.out.println("Addition is "+result);

    }

}
