import java.lang.*;
interface InfaceA
{
double m=(3.986004418*(10^5));
public double getVelocity(double r);
interface InfaceB
{
public double getAcceleration(double r);
}
}
class velocity implements InfaceA
{
public double getVelocity(double r)
{
	double D;
	double m=(3.986004418*(10^5));
	D=(Math.sqrt(m/r));
System.out.println("velocity="+D);
return D;
}
}
public class NestedInterfaceD
implements InfaceA.InfaceB
{
public double getAcceleration(double r)
{
	double m=(3.986004418*(10^5));
	double B;
	B=(m/(r*r));
System.out.println("Acceleration="+B);
return B;
}
public static void main(String str[])
{
InfaceA.InfaceB c=new NestedInterfaceD();
c.getAcceleration(10);
velocity v=new velocity();
v.getVelocity(10);
}
}