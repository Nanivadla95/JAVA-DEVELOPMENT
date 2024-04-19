package str;
import java.util.Scanner;
public class next {
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n1,n2,n3,c=0;
	 n1 =sc.nextInt();
	 n2 =sc.nextInt();
	 n3 =sc.nextInt();
	 while(n2<=n3)
	 {
		int t=n2;
		 while(t>0)
		 {
			 if(t%10==n1)
				 c++;
			 t=t/10;
		 }
			n2++; 
			 
		 }
		 
		 System.out.println(c);
	 }
	
	
}

