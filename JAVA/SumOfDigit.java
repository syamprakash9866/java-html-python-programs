import java.util.*;
 
class SumOfDigit
{ public static void main(String[]args)
 { 
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the num ");
      int num=scan.nextInt();
     syam s=new syam();
       int res =s.findSum(num);
       System.out.println(" ur ansr is : "+res);
}
}



 class syam
{   int findSum(int num)
  {  
      int digit=0;
      int sum=0;
      
       while(num!=0)
        {
         digit=num%10;
	 sum=sum+digit;
	 num=num/10;
        }
          return sum;
  }
}
   
 