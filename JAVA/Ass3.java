import java.util.*;
public class Ass3
{ 
   public static void main(String[]args)
{   
     Scanner scan=new Scanner(System.in);     
	 System.out.println("enter 2 texts: ");
         String s=scan.next();
	String t=scan.next();
	String rev1="";
	String rev2="";
       String q="";
	 String r="";
     if(s.length()==t.length())
	{     System.out.println(s);
	      System.out.println(t);
       
	}
   for(int i=0;i<s.length();i++)
	{   rev1=s.charAt(i)+rev1;
	}
   for(int j=0;j<t.length();j++)
	{   rev2=t.charAt(j)+rev2;
	}
  	
       if(s.length()>t.length())
	 {  for(int k=0;k<rev2.length();k++)
	     { q=rev1.charAt(k)+q;
	
             }System.out.println("output:"+q+t);
         }

	else if(s.length()<t.length())
	 {  for(int l=0;l<rev1.length();l++)
	     { r=rev2.charAt(l)+r;
	
             }System.out.print("output:"+r+s);
         }
}
}
