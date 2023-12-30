import java.util.*;

class rev{
public static void main(String[]args)
{ Scanner scn=new Scanner(System.in);
System.out.print("enter ur nmse: ");
String s=scn.nextLine();
String rev="";

for (int i=0;i<s.length();i++)
{
      rev=s.charAt(i)+rev;
}
System.out.println(rev);
}
}