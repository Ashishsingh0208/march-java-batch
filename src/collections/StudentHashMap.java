package collections;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

    public void createHashMap(){

        //SYNTAX :  HashMap < KeyDATATYPE, ValueDATATYPE> objName= new HashMap<>();

        HashMap <Integer, Student> studentHashMap= new HashMap<>();

        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Mukesh",2,"IT");
        Student student3= new Student("Rahul",3,"CS");

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);

        System.out.println(studentHashMap.get(1).getName());
        System.out.println(studentHashMap.get(1).getRollno());
        System.out.println(studentHashMap.get(1).getSection());

        for (Integer var : studentHashMap.keySet()){

            System.out.println("Printing using advance for loop :" +studentHashMap.get(var).getName()+
                                ": "+studentHashMap.get(var).getRollno()+": "+studentHashMap.get(var).getSection() );
        }

    }

    public static void main(String[] args) {
        StudentHashMap obj= new StudentHashMap();
        obj.createHashMap();
    }
}
