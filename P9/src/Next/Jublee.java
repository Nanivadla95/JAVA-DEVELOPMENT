package Next;
import java.util.Scanner;
public class Jublee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 int n= sc.nextInt();
 int a,b,rc=0;
a =sc.nextInt();
b= sc.nextInt();
for (int i=a;i<=b;i++) 
   {
	 int  c=0;
     for(int j=1;j<=i;j++)
   {
	if(i%j==0)
		 c++;
   }
	if(c%2!=0)
	{
	 System.out.print(i);
	 rc++;
     }	
   }
     System.out.print(rc);
   }
}
	
