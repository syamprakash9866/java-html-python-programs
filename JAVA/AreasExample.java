import java.util.*;
class AreasExample
{
public static void main(String[]args)
{
 Scanner scan=new Scanner(System.in);
   System.out.println("enter the shapoe u want the know the area;");
        String s=scan.next();
 if(s.equals("circle"))
{
   System.out.println("enter the radius");
    double r=scan.nextDouble();
    double a=3.14*r*r;
    System.out.println("area of the of circle is;"+a);
    
}
 else  if (s.equals("triangle"))
{
   System.out.println("enter the radius");
   double r=scan.nextDouble();
  System.out.println("enetr te height: ");
   double h=scan.nextDouble();
     double a=0.5*h*r;
   System.out.println("ur triangle is :"+a);
}
else if(s.equals("square"))
{
System.out.println("enter the length");
  float l=scan.nextFloat();
  float a=l*l;
System.out.println("ur square area is; "+a);
}
else
{ System.out.println("u hv enterd invalid shape");
}
}
}