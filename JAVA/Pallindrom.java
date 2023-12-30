import java.util.*;
  class Pallindrom
{   public static void main(String[]args)
{    
        Scanner scan=new Scanner(System.in);
	 System.out.println(" enter a number: ");
          int n=scan.nextInt();
	  syam s=new syam();
	  int rev=s.reverse(n);

          if(rev==n)
        { System.out.println("ur number is is pallindrom: ");
	}
         else
 	{ System.out.println("ur is not pallindrom");
	 }
}
}



   class syam
{   int reverse(int n)
{      
          int rev=0;
          int digit =0;
         
 	  while (n!=0)
  {    
         digit=n%10;
 	 rev=rev*10+digit;
 	 n=n/10;
   }return rev;

         
          
}
}