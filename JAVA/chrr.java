import java.util.*;

class chrr{
public static void main(String[]args)
{
Scanner scn=new Scanner(System.in);
System.out.print("enter uy num: ");
int n=scn.nextInt();
int fn=0;
int sn=1;
int tn=0;
int sum=1;
int count=2;

if(n==1){
System.out.println("count:2, avg:0.5");
}
else if(n==0){
System.out.println(" count:1, avg:0");
}
else{
System.out.print(fn+" "+sn);
int i=3;
while (tn<n)
{ tn=fn+sn;
if(tn<n)
{
   fn=sn;
    sn=tn;
sum=sum+tn;
System.out.print(" "+tn);
i++;
count=count+1;}
}

int vg=sum/count;
System.out.println("   sum is:"+sum+" count: "+count+" avg is "+vg);
}
}
}