import java.util.*;
class samd
{
public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
  System.out.println(" enter two numbers");
   int a=scan.nextInt();
   int b=scan.nextInt();
    int c=a+b ;
   System.out.println("addition is"+c);
      c=a-b;
    System.out.println("subtraction"+c);
       c=a*b;
    System.out.println("multipliucation is "+c);
      c=a/b;
    System.out.println("division is "+c); 
}
}