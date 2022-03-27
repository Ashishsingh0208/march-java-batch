package collections;

import model.Student;

import java.util.ArrayList;

public class ListWithStudent {

    public void createStudentList(){

        // SYNTAX : CollectionName <DataType> obj=new CollectionName<>();

        ArrayList <Student > studentArrayList= new ArrayList<>();

        // create object for Student

        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Rahul",2,"IT");
        Student student3= new Student("Mukesh",3,"CS");
        Student student4= new Student("Mohit",4,"CS");

        // add object to studentArrayList

        studentArrayList.add(student1);//0
        studentArrayList.add(student2);//1
        studentArrayList.add(student3);//2
        studentArrayList.add(student4);//3

        // get student information
        Student student= studentArrayList.get(3);

        System.out.println("Printing Student information Name : "+student.getName());
        System.out.println("Printing Student information Rollno : "+student.getRollno());
        System.out.println("Printing Student information Section : "+student.getSection());

        // setter method
        student.setName("JAVA");
        System.out.println("Printing Student information Name after using Setter method: "+student.getName());


        for (int i=0; i<studentArrayList.size(); i++){

            System.out.println("Printing Student Data in Loop " +studentArrayList.get(i).getName());
        }

        for (Student var: studentArrayList){


            System.out.println("Printing inside ADVANCE LOOP: " +var.getName() + ": "+var.getRollno()+": "+var.getSection());
        }

    }

    public static void main(String[] args) {
        ListWithStudent obj= new ListWithStudent();
        obj.createStudentList();
    }

}
