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
          
		 
	for(int j=Snum;j>Enum;j++)
	{
	     		syam p=new syam();
	      int res=p.check(j);
		if (res==j)
	     {  System.out.println(j);
	     } 
        }
   }
}
class syam
{   
   static int check(int j)
   {   
         int sum=0;
                for(int i=1;i<j;i++)
                   {   
                      if(j%i==0)
                           {
                             sum=sum+i;
                            }
		    }
                return sum;
    }
  }
 


 

 





