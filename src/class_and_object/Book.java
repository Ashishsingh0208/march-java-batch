package class_and_object;

public class Book {

   // data members or properties
    String name;

    int pages;

    String writer;


    public static void main(String[] args) {

        // SYNTAX : ClassName objName= new ClassName();
        Book obj1= new Book();

        obj1.name="JAVA";
        System.out.println(" Printing object property : " +obj1.name);

        Book obj2= new Book();
        Book obj3= new Book();


    }


}
