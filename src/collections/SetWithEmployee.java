package collections;

import model.Employee;

import java.util.HashSet;

public class SetWithEmployee {


    public void createSet(){
        // SYNTAX : CollectionName <DataType> obj=new CollectionName<>();

        HashSet <Employee> employees= new HashSet<>();

        Employee employee1= new Employee("RAJ",1,"CS");
        Employee employee2= new Employee("Mukesh",1,"CS");
        Employee employee3= new Employee("Rahul",2,"CS");
        Employee employee4= new Employee("Mohit",3,"CS");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee var: employees){

            System.out.println("Printing Set: "+var.getName());
        }

    }

    public static void main(String[] args) {
        SetWithEmployee obj=new SetWithEmployee();
        obj.createSet();
    }

}
