class Student
{
int roll_no;
String name;
Student(String s,int r)
{
System.out.println("inside student constructor");
}
}
class palak1
{
 
public static void main (String args[])
{
Student s=new Student("abc",0);
System.out.println(s.roll_no);
System.out.println(s.name);


  }  
 }
