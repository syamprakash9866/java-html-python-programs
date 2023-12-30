import java.util.*;
class Bingo
{
 public static void main(String[]args)
{
 Scanner scan=new Scanner(System.in);
	
  	int a[]={1,2,3,4,5};
	int num;
           
   do  { 
	System.out.println("enter the numbers u want  btwn 1 to 50:");
	      num=scan.nextInt();
	 if(num<1||num>50)
	{ System.out.println("enter the crct number :");
		
	}
	}
	while(num<1 || num>50);
	{
               if(num==a[0]||num==a[1]||num==a[2]||num==a[3]||num==a[4])
		{     System.out.println("bingo");
	
		}

      		 else {
			    System.out.println("not bingo");
			}
            }
       
}
}
