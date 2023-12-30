import java.util.*;
class Main2
{
 public static void main (String[]args)
{
   Scanner scan=new Scanner(System.in);
	System.out.println("enter the text here");
	 String s=scan.nextLine();
	
	
	for(int i=0;i<=s.length();i++)
{	 for(int j=0;j<=i;j++)
{      
	System.out.println(s[j]);
}
}


   
}
}