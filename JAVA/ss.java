import java.util.*;
class ss
{
 public static void main(String[]args)
{
    Scanner scan=new Scanner(System.in);
System.out.println(" enter the number: ");
   int n=scan.nextInt();
  
  for( int i =0;i<n;i++)
{    n=n-1;
 for (int j=0;j<=i;j++)
	{   
		 System.out.print(" ");
	
          System.out.print("*");
         }System.out.println();
}
}
}