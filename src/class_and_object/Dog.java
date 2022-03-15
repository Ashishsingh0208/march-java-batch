package class_and_object;

public class Dog {

    // data members or properties
    String name;
    String breed;
    int height;


    public static void main(String[] args) {

        // SYNTAX : ClassName objName= new ClassName();

        Dog obj=new Dog();

        obj.name="Bruno";
        obj.breed="Husky";

        System.out.println("Printing dog object : "+obj.name + " : " + obj.breed);

    }

}
