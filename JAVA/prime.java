import java.util.*;
class prime
{ public static void main(String []args)
{
   Scanner scan=new Scanner(System.in);
 	 int n=scan.nextInt();
        
        if(n==1||n==2)
	{ System.out.println("its is prime ");
        }

        for (int i=2;i<n;i++)
	{ 
          if (i%n==0)
           {System.out.println(" it is not prime");
            }
	  else 
	 {System.out.println("it is prime :");
	 }break;
       }
}
}