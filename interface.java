interface animal
{
void speak();
void eat();
}
class cat implements animal
{
public void speak()
{
System.out.println("meaw");
}
public void eat()
{
System.out.println("inside cat class");
}
}
class dog implements animal
{
public void speak()
{
System.out.println("bark");
}
public void eat()
{
System.out.println("inside dog class");
}
}
class main
{
public static void main(String[] args)
{
cat c=new cat();
c.speak();
c.eat();
dog d=new dog();
d.speak();
d.eat();
}
}