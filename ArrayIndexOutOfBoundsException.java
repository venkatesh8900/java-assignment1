import java.lang.*;
public class ArrayIndexOutOfBoundsException
{
  public static void main(String args[])
  {
    int marks[] = { 40, 50, 60 };
 
    int m1 = marks[3];                            
    System.out.println("Marks are " + m1);
  }
}