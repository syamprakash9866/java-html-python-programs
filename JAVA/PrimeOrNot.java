import java.util.*;


class PrimeOrNot
{  public static void main(String []args)
 {   
     Scanner scan=new Scanner(System.in);
     System.out.println("enter a number a tp check: ");
      int a=scan.nextInt();
     Prime pr=new Prime();
      boolean res=pr.isPrime(a);
   if(res==true)
 {   System.out.println("it is prime: ");
  }
   else 
    {  System.out.println("it not prime: ");
     }
    
  }
 }



 class Prime
{ 
      boolean isPrime(int n)
{      if (n==0||n==1)
	{
	return false;
	}
	else if (n==2)
	{
	  return false;
	}
       else 
	{
	  for (int i=2;i<n;i++)
	{ if(n%i==0)
	    {
	      return false;
  	     }
	}return true;
	}
}
}

  








