package str;
import java.util.Scanner;
public class Demo {
public static void main(String args)
{
Scanner sc= new Scanner (System.in);
 int n = sc.nextInt();
 int i=2,j,c=0,flag=0,t1=1,t2=1,nt=0;
 if(n%2==0)
 { 
	 n=n/2;
	 while(true)
	 {
		flag =0;
		for(j=2;j<=i/2;j++)
		{		
			  if(i%j==0) 
			  {
				  flag=1;
				  break;
			  }
		}
		if(flag==0)		  
		{
				c++;  
				 if (c==n) 
				 { 
					 System.out.print(i);	
				 }
		    }
		 i++;
		}  
 }	  
	 else
	 {
		 n=n/2+1;
		 if(n==1||n==3)
	 System.out.print("1");
 else {
   for(i=3;i<=n;i++)
   {
     nt=t1+t2;
     t1=t2;
     t2=nt;
   }
	 System.out.println(nt);
      } 
	 }
   }
 }


	


