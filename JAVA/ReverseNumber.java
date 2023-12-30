import java.util.*;
  class ReverseNumber
{ public static void main (String[]args)
  {   Scanner scan=new Scanner(System.in);
       System.out.println("enter the num");    
       int n=scan.nextInt();
      syam s=new syam();
      int dup=s.reverse(n);
System.out.println(" reverse number is: "+dup);
}
}


class syam
{ 
   int reverse(int n)
  {  
        int dup=0;
 	int digit=0;
      while (n!=0)
{      
        digit =n%10;
        dup=dup*10+digit;
        n=n/10;

}return dup;
  
}
}