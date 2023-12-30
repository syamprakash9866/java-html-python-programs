import java.util.*;
class AvgExamlpe
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("entrr 3 numbers for finding avg");
      int a=scan.nextInt();
      int b=scan.nextInt();
      int c=scan.nextInt();
       double sum=a+b+c;
      double avg=sum/3.0;
    System.out.println("ur avg is "+avg);
}
}