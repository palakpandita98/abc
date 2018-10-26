class Human
{
String name;
Human(String n)
{
name=n;
}
}
class Student extends Human // THIS IS CHILD CLASS
{
int rollno;
Student ()
{
super("nothing");
rollno=5;
}
Student (String n, int r)
{
super(n);
rollno=r;
}
}
class palak3
{
public static void main(String[] args)
{
Student x=new Student("palak",0);
Student y=new Student();
System.out.print(x.name+" "+x.rollno);
}
}