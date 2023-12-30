import java.util.*;
 class Power1Method 
{ public static void main (String []args)
{   Scanner scan=new Scanner(System.in);
      System.out.println("enter the base and power below");
      int base =scan.nextInt();
      int power =scan.nextInt ();
        int s =1;
    for (int i=1;i<=power;i++)
   {     
         s= s*base;
     }
     System.out.println("ur snar is : "+s);
   }
}