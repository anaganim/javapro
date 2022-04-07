package string_java;

class StringinternDemo
{
	
public static void main(String args[])

{
String s1=new String("mahesh");
String s2=s1.intern();
System.out.println(s1==s2); 
String s3="mahesh";
System.out.println(s2==s3); 
}
}
