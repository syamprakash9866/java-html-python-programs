import java.util.*;
class Range
{ 
 public static void main(String[]args)
  {
     Scanner scan=new Scanner(System.in);
	System.out.println("enter the 1st number inbtwn: ");
	int n=scan.nextInt();
        System.out.println("enter the 2nd number inbtwn: ");
          int m=scan.nextInt();
         
          syam s=new syam();
          int sum= s.add(n,m);
       System.out.println("ur ansr is:  "+sum);
  } 
}

class syam
{ 
  int add(int n,int m)
{  
	int sum=0;
    for(int i=n;i<=m;i++)
 	{
	  sum=sum+i;
	} return sum;
}
}
 

 
            