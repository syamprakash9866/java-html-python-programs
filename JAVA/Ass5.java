import java.util.*;

 public class Ass5
{ 
   public static void main(String[]args)
{   
     Scanner scan=new Scanner(System.in);     
	 System.out.println("enter 1st number: ");
         int n[]=new int[10];
	int m[]=new int[10];
	int dup=0;
	int count=0;
	for(int i=0;i<=3;i++)
     {  n[i]=scan.nextInt();
      }
      for(int i=0;i<=3;i++)
        {  System.out.print(n[i]);
         }System.out.println();
    System.out.println("enter 2nd number: ");
              for(int j=0;j<=3;j++)
                 {  m[j]=scan.nextInt();
                  }
                  for(int j=0;j<=3;j++)
                    {    System.out.print(m[j]);
		    }
   
        for(int l=0;l<n.length;l++){
         for(int z=0;z<m.length;z++)                
            {      if(n[l]==m[z])
                      {count++;}
            } 
        } System.out.println(count);
}
}
