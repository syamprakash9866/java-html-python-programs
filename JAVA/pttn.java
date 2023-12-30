import java.util.*;
class primeornot{
boolean check(int m)
{
   if (m==0||m==1)
  {
   return false;
    }
   for (int i=2;i<m;i++)
     {
        if (m%i==0)
        {
           return false;
         }
     
     } return true;

}


public static void main(String[]args)
{
Scanner scn=new Scanner(System.in);
   System.out.print("1st num: ");
  int n=scn.nextInt();
System.out.print("2nd num: ");
  int g=scn.nextInt();
   primeornot pm=new primeornot();
   int count=0;
 for(int k=n;k<g;k++)
{
  boolean res =pm.check(k);
  if (res)
    {  System.out.print(k+" ");
       count=count+1;
     }
   
  
}
System.out.print("\n totl count is : "+count);
}
}






class pttn{





}