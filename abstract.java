abstract class animal
{
String breed;
String color;
String name;
abstract void eat();
void speak()
{
System.out.println("inside print function");
}
}
class any extends animal
{
any()
{
breed="abc";
color="black";
name="xyz";
System.out.println(breed+" "+color+" "+name);
}
void eat()
{
System.out.println("abstract");
}
}
class main
{
public static void main(String[] args)
{
any a=new any();
a.eat();
a.speak();
}
}