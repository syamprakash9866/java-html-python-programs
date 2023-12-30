import java.util.*;
public class Ass2
{ 
   public static void main(String[]args)
{   
     Scanner scan=new Scanner(System.in);     
	 System.out.print("enter text: ");
      String s=scan.next();
     String rev="";
     
	for(int i=0;i<s.length();i++)
	    {  
	     rev=s.charAt(i)+rev;
            } 
         System.out.println("ur rev text is : "+rev);

	   
            char a[]=rev.toCharArray();
           for (int j=0;j<rev.length();j++)
	{    
	     System.out.print("-"+a[j]); 
	}
    



}
}