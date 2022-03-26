package collections;

import java.util.ArrayList;

public class DemoList {


    public void createList(){

     // SYNTAX :   CollectionName objName= new CollectionName();

        ArrayList list = new ArrayList();

     // adding elements to list
        list.add("Java");// 0 index
        list.add("Spring boot");// 1
        list.add("Cloud");// 2
        list.add("Microservice"); //3
        list.add(1);
        list.add(3.5);

      // getting an element
      System.out.println("Printing list " +list.get(3));
        System.out.println("Printing list " +list.get(0));
        System.out.println("Printing list " +list.get(1));

        for (int i=0; i< list.size(); i++)
        {

            System.out.println("Normal Loop " + list.get(i));
        }

        for (Object var: list){

            System.out.println("Advance loop "+var);
        }

        // delete element

        list.remove(3);
    }


    public static void main(String[] args) {
        DemoList obj= new DemoList();
        obj.createList();
    }

}
