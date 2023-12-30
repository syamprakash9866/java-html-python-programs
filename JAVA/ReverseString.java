import java.util.*;
 class ReverseStringMethod1
{  public static void main(String []args)
 {  
          Scanner scan= new Scanner(System.in);
          System.out.println(" enter the string");
         String str=scan.next();
	 
           StringBuilder b=new StringBuilder(str);
	   b.reverse();
	 System.out.println(" your ansr is :"+b.toString());
}
}