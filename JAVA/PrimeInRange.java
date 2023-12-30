import java.util.*;
class PrimeInRange
{  public static void main(String[]args)
{      
      Scanner scan=new Scanner(System.in);
  	 System.out.println("ebter two numbers: ");
          int a=scan.nextInt();
           int b= scan.nextInt();
          int count =0;
         syam s=new syam();
         for (int i=a; i<=b;i++)
	{  
    	   boolean res= s.primeList(i);
           if(res==true)
           {  count++;
            System.out.println(i);
	    } 
	    
         }System.out.println("ur county is: "+count);
   }
}
 



class syam

{ boolean primeList(int n)
 { 
    if (n==0|| n==1)
      {  return false; 
	}
    else if(n==2)
	{ return true; 
	}
    else 
	{
   	  for (int x=2;x<n;x++)
	   {  
             if (n%x==0)
	         { return false;
	        } 
              
           }return true;	
	
         }
  }
}

   
 






