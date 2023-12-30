import java.util.*;
class pattarnn
{
 public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
    System.out.println("enter ur number : ");
    int n=scan.nextInt();  
	for(int i=1;i<=n;i++)
     { 	for(int j=i;j<=n;j++)
	{ System.out.print(" ");
        }
	for(int k=1;k<=i;k++)
          {   System.out.print("*");
          }
	for (int l=2;l<=i;l++)
         { System.out.print("*");
        }System.out.println();
    }
}
}