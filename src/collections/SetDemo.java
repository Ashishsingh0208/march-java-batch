package collections;

import java.util.HashSet;

public class SetDemo {

    public void createSet(){

        // SYNTAX : CollectionName <DataType> obj=new CollectionName<>();

        HashSet <String >  stringHashSet= new HashSet<>();

        stringHashSet.add("Java");
        stringHashSet.add("Java");
        stringHashSet.add("Spring Boot");
        stringHashSet.add("Cloud");
        stringHashSet.add("Spring Boot");
        stringHashSet.add("Spring Boot");
        stringHashSet.add("Cloud");
        stringHashSet.add("Cloud");

        for (String var: stringHashSet){

            System.out.println("Printing SET "+var);
        }


    }

    public static void main(String[] args) {
        SetDemo obj = new SetDemo();
        obj.createSet();
    }
}
