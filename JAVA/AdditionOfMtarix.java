import java.util.*;
class AdditionOfMtarix
{  
   public static void main(String[]args)
{   
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the rows and columns");
   	 int n=scan.nextInt();
	 int m=scan.nextInt();

   	 int matrix1[][]=new int[n][m];
	 System.out.println("enter the numbers ");

    for( int i=0;i<matrix1.length;i++)
	{  
    	 for (int j=0;j<matrix1[i].length;j++)
	{

	  matrix1[i][j]=scan.nextInt();
	}
	}

     int matrix2[][]=new int[n][m];
	 System.out.println("enter the numbers ");

    for( int i=0;i<matrix2.length;i++)
	{  
    	 for (int j=0;j<matrix2[i].length;j++)
	{

	  matrix2[i][j]=scan.nextInt();
	}
	}
	  
         
System.out.println("your matrix is: ");
	int matrix3[][]=new int[n][m];
 	for (int i=0;i<matrix1.length;i++)
	{
	 	  for (int j=0;j<matrix1[i].length;j++)
		{
		   matrix3[i][j]=matrix1[i][j]+matrix2[i][j];	
              
		}
		System.out.println();
	}
	
		for (int i=0;i<matrix1.length;i++)
	{
	 	  for (int j=0;j<matrix1[i].length;j++)
		{
		   System.out.print(+matrix3[i][j]+" ");	
              
		}
		System.out.println();
	}
}
}
   