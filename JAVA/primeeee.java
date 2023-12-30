import java.util.*;
class primeeee
{ 
 public static void main(String[]args)
{ Scanner scan=new Scanner(System.in);
  System.out.println("prime nums below ");
     int count=0;
for (int i=0;i<=200;i++)
{ count=0;
	 for(int j=1;j<=i;j++)
{             if(i%j==0)
{	count++;
}
}
   if(count==2)
{     System.out.print(" "+i);
}


}
}}