import java.util.*;
class ArrayExample
{
  public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
 System.out.println("enter the size of the array :");
  int s=scan.nextInt();
  int marks[]=new int[s];
System.out.println("enter the marks of the students");
 for (int i=0; i<s ; i++)
    { 
      marks[i]=scan.nextInt();
     }
System.out.println("marks of the students: ");
  for (i=0; i<marks[]; i++)
   { 
    System.out.println(marks[i]);
    }
}
}