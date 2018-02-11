import java.lang.*;
import java.util.Scanner;
import java.util.*;
interface MeanInterface
{
public double Mean();
}
class mean implements MeanInterface
{
public double Mean()
{
int ar[]=new int[6];
int i;
float sum=0;
float m;
Scanner s=new Scanner(System.in);
System.out.println("enter no");
for(i=0;i<6;i++)
{
ar[i]=s.nextInt();
sum=sum+ar[i];
}
m=sum/6;
System.out.println("mean="+m);
return m;
}
}
class Deviation implements MeanInterface
{
public double Mean()
{
double m=(Mean()/6);
System.out.println("mean deviation ="+m);
return m;
}
}
public class Main
{
public static void main(String str[])
{
mean Z=new mean();
Z.Mean();
Deviation d=new Deviation();
d.Mean();
}
}
