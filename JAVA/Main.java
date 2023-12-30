import java.util.*;
  class Main
{
  public static void main(String[]args)
  { 
    Scanner scan=new Scanner(System.in);
	System.out.println("entert the number u want print upto ");
	int n=scan.nextInt();
       int sum=0;
   for (int i=1; i<=n;i++)
	{
	   sum=sum+i;
	}
	System.out.println("sum of ur numebers is: "+sum);   
  }
}
     
      