package collections;

import java.util.HashMap;

public class DemoHashMap {

    public void createHashMap(){

        //SYNTAX :  HashMap < KeyDATATYPE, ValueDATATYPE> objName= new HashMap<>();

        HashMap<Integer, String> hashMap= new HashMap<>();

        //  adding elements to map  put(key,value);

        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring Boot");
        hashMap.put(4, "Cloud and Microservice");

        // get method : get(key);

        System.out.println("Printing Map :"+hashMap.get(4));
        System.out.println("Printing Map :"+hashMap.get(1));
        System.out.println("Printing Map :"+hashMap.get(2));


        hashMap.keySet();// return set of all Keys
        System.out.println("Printing all Key "+hashMap.keySet());

        for (Integer var : hashMap.keySet())
        {

            System.out.println("Printing HashMap in advance loop " +hashMap.get(var));
        }

    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();
    }




}
