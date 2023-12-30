import java.util.*;
class ass1
{
 public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
    System.out.println("enter ur text : ");
      
	String b1=scan.nextLine();
	String b2=scan.nextLine();
         int r=scan.nextInt();
        String  s=b1.substring(5,10);
	String t=b2.substring(5,10);
       int q=Integer.parseInt(s);
        int w=Integer.parseInt(t);
	int digit=0;
	digit=w-q;
	digit=digit*r;
   
   System.out.println("output:");
     System.out.println("("+s+"-"+t+")*"+r);
  System.out.println(digit);
}
}
