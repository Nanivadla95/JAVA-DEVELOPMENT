package str;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n1=6,n2=60,n3=70,c=0,t;
		for(int i=n2;i<=n3;i++)
		{
			t=i;
			while(t>0)
		 {
			 if(t%10==n1)
				 c++;
			 t=t/10;
		 }

			 
		 }
		 
		 System.out.println(c);
	 }
	
	
}




