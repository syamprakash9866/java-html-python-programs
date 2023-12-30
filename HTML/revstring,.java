import java. util.*;

class revstring
{
 public static void main(String[]args)
{
   Scanner scan=new Scanner(System.in);

	  System.out.println("enter ur text");
	String g=scan.nextLine();
	 String rev=("");
      for (int i=0;i<g.length(); i++)
{	
 	rev=g.lengthCharAt(i)+rev;
}
	 System.out.println("u rev text is: "+rev);
}
}