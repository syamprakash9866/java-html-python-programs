import java.util.*;
class Example
{
 public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
	System.out.println(" entewr the the number ");
        int n=scan.nextInt();
	int sum=0;
	int digit=0;
	
     for(int i=0;n>0;i++)
{	
 	digit=n%10;
	sum=sum+digit;
	n=n/10;   
	
}
System.out.println("sum of  numbers= "+sum);
}	
}