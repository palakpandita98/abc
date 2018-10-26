//overriding//
class Human
{
void speak()
{
System.out.println("Hello");
}

}
class Student extends Human
{
void speak()
{
System.out.println("GOOD MORNING");
}
}
class palak5
{
public static void main (String [] args){
Student s= new Student();
s.speak();
}
}
