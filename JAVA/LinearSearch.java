import java.util.*;
class LinearSearch
{ 
   public static void main(String []args)
{  
   Scanner scan=new Scanner(System.in);
     	int flag=0;
   	System.out.println("enetr the size of the array: ");
    	int n=scan.nextInt();
     	 String nums[]=new String[n];
	System.out.println("enetr the names: ");
   for(int i=0;i<n; i++)
   	{ 
      	 nums[i]=scan.nextLine();
   	 }
  System.out.println("enter the name  u want serach:");
  String search=scan.nextLine();
 for ( int i=0;i<n;i++)
    	{  if (search.equals (nums[i]))
        	 {  flag=1;
        
   	}
    }	
	if (flag==1)
          { System.out.println("number is  found"); 
           }
      else {
             System.out.println("number is not found");
            }
}
}