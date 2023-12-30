import java.util.*;
class revv
{
 public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
    System.out.println("enter ur text : ");
      
	String s=scan.nextLine();
	String rev="";
   for (int i=0;i<s.length();i++)
      {
 	rev=s.charAt(i)+rev;
       } System.out.println("ur rev text is: "+rev);
System.out.println(s);
if(rev.equals(s))
{System.out.println("it is pallindrom");
}
else{
System.out.println("not pallindrom ");         


}

}
}