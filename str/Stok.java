package str;
import java.util.Scanner;
public class Stok {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int i=1, j=1;
		if(n%2==0)
		{
			n =n/2;
			for(int x=1;x<=n-1;x++)
				i=1*3;
			System.out.println(i);
			
		}
		else 
		{
			n=n/2+1;
			for (int x=1;x<=n-1;x++)
				j=j*2;
			System.out.println(j);
		}
	}
	
}


