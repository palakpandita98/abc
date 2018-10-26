//method overiding combined//
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
super.speak();
System.out.println("GOOD MORNING");
}
}
class palak6
{
public static void main (String [] args){
Student s= new Student();
s.speak();
}
}
