import java.lang.*;
import java.util.Scanner;
import java.util.*;
public class Program2 {
public static void main(String[] args) {
int row, col, i, j,min ,max ;
int arr[][] = new int[10][2];
Scanner scan = new Scanner(System.in);
System.out.print("Enter row for the array (max 10) : ");
       row = scan.nextInt();
       System.out.print("Enter column for the array (max 2) : ");
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
     for(j=0; j<col; j++)
       { max=arr[i][j];
       min=arr[i][j];
           for(i=0; i<row; i++)
           {
              
              
               if(arr[i][j]>max)
               {
                   max=arr[i][j];
               }
                if(arr[i][j]<min)
               {
                   
                   min=arr[i][j];
               }
           }
         System.out.print("\nThe maximum in"+(j+1)+"column is"+ max +"\nthe minimum in"+(j+1)+"column is"+min);  
       }
     
     
           
    }
    
}