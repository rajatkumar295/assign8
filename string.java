import java.util.Scanner;
class string
{
public static void main(String[] args)
{
Scanner n=new Scanner(System.in);
String a;
String b;
a=n.next();
b=n.next();
int c,d;
c=Integer.parseInt(a);
d=Integer.parseInt(b);
if(c>d)
{System.out.println("c is greater than d");}
else
{System.out.println("d is greater than c");} 
}
}