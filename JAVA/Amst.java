import java.util.*;
class Amst
{
 public static void main(String[]args)
{
  Scanner scan=new Scanner(System.in);
    System.out.println("enter how many digits you want: ");
    int n=scan.nextInt();     
	int l=(int)Math.log10(n)+1;
System.out.println(l);
  	int digit=0;
	int sum=0;
	int dup=n;
for (int i=0;i<l;i++)
{  
	digit=n%10;
	sum=sum+(int)Math.pow(digit,l);
	n=n/10;
}
System.out.println("a="+sum);

if(sum==dup)
 {
 System.out.println("this number is  amstrong number.");
 }
else
 {  System.out.println("this number is not  amstrong number."); 
 }


}

}