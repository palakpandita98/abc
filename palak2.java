class Student
{
int roll_no;
String name;
Student(String s,int r)
{ roll_no=r;
name=s;
System.out.println("Rollno:"+roll_no+"Name:"+name);
}
}
class palak2
{
 
public static void main (String args[])
{
Student s=new Student("abc",265);
System.out.println(s.roll_no);
System.out.println(s.name);


  }  
 }