import java.util.*;
 public class matt
{   public static void main (String[]args)
{
    Scanner scan=new Scanner (System.in);
     System.out.println(" enter the mtrix sizes : ");
     int row =scan.nextInt();
     int col=scan.nextInt();
     int matrix[][]=new int[row][col];
    
       for (int i=0; i<matrix.length; i++)
     {    for (int j=0; j< matrix[i].length; j++)
            { 
                 matrix[i][j]=scan.nextInt();

             }
    }
  for (int i=0; i<matrix.length; i++)
     {    for (int j=0; j< matrix[i].length; j++)
            {
  
      System.out.print(matrix[i][j]);
}System.out.println();}
}
}
             