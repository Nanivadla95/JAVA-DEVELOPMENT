package str;
import java.util.Scanner;
public class Break
{

	public static void main(String[] args) 
	{
		
 Scanner sc = new Scanner (System.in);
 int n;
 n = sc.nextInt();
 int i=2,j,c=0;
 boolean flag;
 while(true)
 {
	 flag= true; 
	 for(j=2;j<=i/2;j++);
	 {
		 if(i%j==0)
		 {
		 flag =false;
		 break;
	   }
	 }
	 if (flag)
	 {
		 c++;
	 if (c==n)
	 {
		 System.out.println(i);
		 break;
	        }
	    }
 
 i++;
	
	}
} 
 
}
 
 
 
  


