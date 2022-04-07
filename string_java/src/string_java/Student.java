package string_java;

class Student
{
	
String name;
int rollno;
Student(String name,int rollno)

{
this.name=name;
this.rollno=rollno;
}

public static void main(String args[])

{
Student s1=new Student("scott",102);
Student s2=new Student("john",102);
Student s3=new Student("harry",101);
Student s4=s2;
System.out.println(s4.equals(s2)); //true
System.out.println(s1.equals(s3)); //false
System.out.println(s1.equals(s4)); //false
System.out.println(s3.equals(s2));
}
}
