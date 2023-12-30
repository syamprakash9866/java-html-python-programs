import java.util.*;



class OoopsConcept1
{
   public static void main(String[]args)
{   
        Food f=new Food();
	f.time=6.50;
	f.foood="egg and banana" ;
	f.juice=" orange";
  System.out.println( +f.time+" "+f.foood+" "+f.juice+"end");
}
}     
class Food
{
      Double time;
      String foood;
      String juice;
}