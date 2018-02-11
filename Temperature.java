import java.lang.*;
import java.util.Scanner;
public class Temperature
 {
public static void main(String[] args)
 {
int max,min,row, col, i, j;
int arr[][] = new int[10][15];
Scanner scan = new Scanner(System.in);
System.out.print("Enter row for the array (max 5) : ");
row = scan.nextInt();
System.out.print("Enter column for the array (max 12) : ");
col = scan.nextInt();
System.out.println("Enter " +(row*col)+ " Array Elements : ");
for(i=0; i<row; i++)
{
for(j=0; j<col; j++)
{
arr[i][j] = scan.nextInt();
}
}
System.out.print("The Array is :\n");
for(i=0; i<row; i++)
{
for(j=0; j<col; j++)
{
System.out.print(arr[i][j]+ "  ");
}
System.out.println();
}
for(j=3; j<=4; j++)
{
for(i=0; i<row;i++)
{
max=arr[i][j];
if(arr[i][j]>max){
max=arr[i][j];    
}
System.out.println("the maximum temperature value in "+(i+1)+"month is"+max);
}
}
for(i=0,j=0;i<row;i++){
min=arr[i][j];
if(arr[i][j]<min)
{
min=arr[i][j];
}
System.out.println("the minimum temperature value in january month is"+min);
}
for(j=11,i=0;i<row;i++){
min=arr[i][j];
if(arr[i][j]<min)
{
min=arr[i][j];
}
System.out.println("the minimum temperature value in december month is"+min);
}
}
}
