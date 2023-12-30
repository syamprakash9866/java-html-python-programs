import java.util.*;
public class Ass4
{ 
   public static void main(String[]args)
{   
     Scanner scan=new Scanner(System.in);     
	 System.out.println("enter number: ");
         int n=scan.nextInt();
	int digit=0;
	int odd=0;             
	int count=0;
	int sum=0;
      int s=(int)Math.log10(n)+1;
	
      for (int i=0;i<s;i++)
	{ 
	digit=n%10;
	count=digit;
	   n=n/10;
  	
		if(count%2!=0)
		{    sum=sum+count;
			}
       }System.out.println("sum of odd numbers in the given:"+sum);

          if(sum%2==0)
{System.out.println("output:2");
}else{System.out.println("output:1");}

}
}