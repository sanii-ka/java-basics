import java.util.Scanner;
class Student 
{
    String name;
    int age;
    double marks;
}
public class class_1
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        Student s1= new Student();
        System.out.print("Enter student name: ");
        s1.name=input.nextLine();
        System.out.print("Enter student age: ");
        s1.age=input.nextInt();
        System.out.print("Enter student marks: ");
        s1.marks=input.nextInt();

        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("Marks: "+s1.marks);
        
        input.close();
    }
}