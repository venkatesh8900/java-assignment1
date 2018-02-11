import java.lang.*;
abstract class Area
{
double pi=3.14;
int r;
abstract void methodArea(int n);
}
class Square extends Area
{
void methodArea(int n)
{
System.out.println("Area of square="+(n*n));
}
}
class circle extends Area
{
void methodArea(int n)
{
System.out.println("Area of circle= "+(pi*n*n));
}
}
class Arear
{
public static void main(String str[])
{
Square s=new Square();
s.methodArea(100);
circle c=new circle();
c.methodArea(100);
}
} 