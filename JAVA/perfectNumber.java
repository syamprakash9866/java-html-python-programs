import java.util.*;
public class perfectNumber
{
  public static void main(String[]args)
{
   Scanner scan=new Scanner(System.in);
	System.out.println("enter from where u want to start : ");
             int Snum=scan.nextInt();

		System.out.println("enter from where u want to end : ");
             int Enum=scan.nextInt();

	      Syam p=new Syam();
	      int res=p.check(s);

     if (res==num)
	{System.out.println("your num is perfect numr:");
	}
 else {
	System.out.println("ur num is not perfect number:");
      }
}
}
 
class Syam
{   
   int check(int num)
{   
    int sum=0;
   for(int i=1;i<num;i++)
{   
  if(num%i==0)
{
  sum=i+sum;
}}
return sum;
}
}

