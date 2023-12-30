import java.util.*;
class MemeNumbers
{
public static void main(String[]args)
 {
      syam s=new syam();
      s.add();
      s.sub();
   
}
}


class syam
{   void add()
 {	Scanner scan=new Scanner(System.in);
    
    System.out.println("enter the number: ");
	int n=scan.nextInt();
     	int sum=0;
	for (int i=0;i<=n;i++)
	{
	    sum=sum+i;
	}
	System.out.println("ansr is : "+sum);
 }

 void sub()
    {  Scanner scan=new Scanner(System.in);
	 System.out.println("enter the 2nd number: ");
         int n=scan.nextInt();
       int x=n*100;
     System.out.println("you scond ansr is "+x);
    }
}