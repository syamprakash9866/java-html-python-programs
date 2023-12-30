import java.util.*;
class arraytwo
{ public static void main(String[]args)
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the rows");
	int row=scan.nextInt();
	System.out.println("enter the columns ");
	int col=scan.nextInt();
	scan.nextLine();
	String names[][]=new String[row][col];
	System.out.println("enter the names: ");
for( int i=0; i<names.length;i++)
{ 
	for (int j=0; j<names[i].length; j++)
  	{
	  names[i][j]=scan.nextLine();
   	}
      
	
}
System.out.println("the class names are::");
for( int i=0; i<names.length;i++)
{	
  	for (int j=0; j<names[i].length; j++)
  	{
	   System.out.print(names[i][j]+ " ");
	     

   	}
  System.out.println();

}

}

}