import java.util.*;
 class pattern1
{  public static void main(String []args)
 { Scanner scan =new Scanner (System.in);
   System.out.println("ENTER THE NUM");
     int n=scan.nextInt();

    for (int i=1;i<=n;i++)
     { for (int j=1;j<=i-1;j++)
      {
	 System.out.print("");
      }


       for (int j=1;j<=i;j++)
      {
	 System.out.print("1");
      }
System.out.println();

    }
}
}
