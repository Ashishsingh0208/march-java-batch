package class_and_object;

public class Student {

    String name;
    int age;
    String section;
    String address;

    public static void main(String[] args) {

        Student obj= new Student();
        obj.name="Raj";
        obj.age=21;
        obj.address="AGRA";

        System.out.println(" Printing Student :" +obj.name);



    }


}
