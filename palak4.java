class Human
{
void display()
{
System.out.print("inside super display");
}
}
class Student extends Human
{
int rollno;
void show()
{
System.out.print("inside sub show");

}
}
class palak4
{
public static void main(String[] args)
{
Student x=new Student();
x.show();
x.display();
}
  }
