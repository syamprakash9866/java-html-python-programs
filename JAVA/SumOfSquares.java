import java.util.*;
class SumOfSquares
{ 
 public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the numnber : ");
 
 	int n=scan.nextInt();
	int ansr=0;
        for (int i=0;i<=n;i++)
       {
	  ansr=i*i+ansr;
	}
        System.out.println(" un r ansr is : "+ansr);
}
}