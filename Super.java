import java.lang.*;
class Supertest
{
	int credit = 5;
	String abc = "India" ;
	public int i=25,exceed =0;
	
	void number(int a)
	{
		if(a>=25)
		{
			exceed =1;
		}
	}
	
	void display()
	{
		if(exceed == 1)
		{
			System.out.println("Course overfloated");
		}
		else
		{
			System.out.println("Course cannot overfloated");
		}
	}
}

public class Super 
{

	public static void main(String arg[]) 
	{
		Supertest s = new Supertest();
		s.number(15);
		s.display();
		s.number(25);
		s.display();
	}

}
