import java.util.*;
 class LeapYear
{  public static void main (String []args)
{     
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the year : ");
     int n =scan.nextInt();
    text t=new text();
    boolean res=t.demo(n);
    if (res==true)
{System.out.println("it isb leaop");
}
else 
{System.out.println(" it not laep year");
}
}
}
     
	

class text
  { boolean demo(int n) 
{

 if(n%100==0)
 {
	 if (n%400==0)
	    { return true;}
           else 
          {return false; }
  }
     else 
{       if(n%4==0)
           { return true;}
	     else { return false;}
}
}
}