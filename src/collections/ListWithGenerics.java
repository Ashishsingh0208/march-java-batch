package collections;

import java.util.ArrayList;

public class ListWithGenerics {

    public void createStringList(){

        // SYNTAX : Collection Name <DataType> obj=new CollectionName<>();

        ArrayList <String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Spring");
        stringArrayList.add("Spring boot");
        stringArrayList.add("Cloud");

        for (String var : stringArrayList){

            System.out.println("Printing string list: "+var);
        }



    }

    public void createIntegerList(){

        // SYNTAX : Collection Name <DataType> obj=new CollectionName<>();

        ArrayList <Integer> integerArrayList= new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(3);

        for(Integer var: integerArrayList){
            System.out.println("printing int list: "+var);
        }

    }

    // create double list


    public static void main(String[] args) {

         ListWithGenerics  obj = new ListWithGenerics();
         obj.createStringList();
         obj.createIntegerList();
    }
}
