import java.util.*;
class ProfitLoss
{
public static void main(String[]args)
{ 
Scanner scan=new Scanner(System.in);
  System.out.println("enter the cost price");
   int cp=scan.nextInt();
  System.out.println("enter the selling price");
   int sp=scan.nextInt();
   int profit=sp-cp;
   int loss=cp-sp;
if(cp<sp)
{ System.out.println("profit: "+profit);
}
else{
System.out.println("loss: "+loss);
}
}
}
   
