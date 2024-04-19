package Foot;
import java.util.Scanner;
public class oxygen {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
	while(n!=1)
	{
		if(n==2)
	     n--;
     else {
    	 if (n%3==0)
    		 n=n/3;
    	 else if(n%3==1)
    		 n--;
    	 else
    		 n++;  
       }
		c++;
    	
	}
	System.out.print(c);
	} 

}
