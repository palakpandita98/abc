class Animal
{
abstract void speak();
}
class Dog extends Animal
{
void speak()
{
System.out.println("Bark");
}
}
class Cat extends Animal
{
void speak()
{
System.out.print("Meow");
}
}
class Lion extends Animal
{
void speak()
{
System.out.print("Roar");
}
}
class palak9
{
public static void main(String[] args)
{
Animal d = new Dog();
d.speak();
d=new Cat();
d.speak();
d=new Lion();
d.speak();
}
}