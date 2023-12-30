import java.util.*;
class assending
{ public static void main(String[]args)
{
   Scanner scan=new Scanner(System.in);
	System.out.println("how numbers u r going enter ");
	int x=scan.nextInt();
 	 int m[]=new int[x];
	for (int i=0;i<x;i++)
{	 m[i]=scan.nextInt();
}
for (int i=0;i<x;i++)
{ System.out.println(m[i]);
}


}
}