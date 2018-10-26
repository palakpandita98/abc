//static block//
class Test
{
int r;
static int count;
static { System.out.println("In static 1");}
static { System.out.println("In static 2");}
{ System.out.println("In non static 1");}
{ System.out.println("In non static 2");}
Test()
{
System.out.println("In constructor");
}
}
class palak8{
static
{
System.out.println("blockss");
}

public static void main(String[] args)
{
System.out.println("in main class");
Test t=new Test();
Test t2=new Test();
}
}






