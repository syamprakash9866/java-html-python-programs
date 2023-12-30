import java.util.*;
class Practice
{  
   public static void main(String[]args)
{   
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the rows and columns");
   	 int n=scan.nextInt();
	 int m=scan.nextInt();

   	 int matrix[][]=new int[n][m];
	 System.out.println("enter the numbers ");

    for( int i=0;i<matrix.length;i++)
	{  
    	 for (int j=0;j<matrix[i].length;j++)
	{

	  matrix[i][j]=scan.nextInt();
	}
	}
     System.out.println("your matrix is: ");
 	for (int i=0;i<matrix.length;i++)
	{
	   for (int j=0;j<matrix[i].length;j++)
	{
	  System.out.println(matrix[i][j]);	
	}System.out.println();
	}
}
}