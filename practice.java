public class practice {
}
public class Student
{
    String name; // instance variable
    int age; // instance variable

    void printInstanceVariable()
    {
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
        System.out.println("**********************");
    }
}

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student john = new Student();
        john.name = "John";
        john.age = 6;
        Student dave = new Student();
        dave.name = "Dave";
        dave.age = 7;
        Student juli = new Student();
        juli.name = "juli";
        juli.age = 5;
        john.printInstanceVariable();
        dave.printInstanceVariable();
        juli.printInstanceVariable();
    }
}
