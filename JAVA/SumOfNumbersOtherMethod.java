import java.util.*;
class SumOfNumbersOtherMethod
{
public static void main(String[]args)
 {
 	Scanner scan=new Scanner(System.in);
    System.out.println("enter the number: ");
	int n=scan.nextInt();
         syam s=new syam();
	int sum=s.add(n);
	System.out.println("ansr is : "+sum);
       
   
}
}


class syam
{   int add(int n)
 {	
     	int sum=0;
	for (int i=0;i<=n;i++)
	{
	    sum=sum+i;
	}
	return sum;
 }

 
}