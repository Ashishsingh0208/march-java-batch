package class_and_object;

public class Employee {
    // data members

    String name;
    int age;
    double salary;

    //parameterized constructor

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        // SYNTAX : ClassName objName= new ClassName( parameters);

        Employee obj= new Employee("Raj",28,35000.5);

        System.out.println("Printing employee "+obj.name);

        Employee obj1= new Employee("Rahul",25,34323);

        System.out.println("Printing obj1 " +obj1.name + " "+ obj1.age +" "+obj1.salary);

    }



}
