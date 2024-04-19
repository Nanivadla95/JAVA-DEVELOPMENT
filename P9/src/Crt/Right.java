package Crt;
import java.util.Scanner;
public class Right {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    int i,j,n,max;
		 n=sc.nextInt();
		int arr[]=new int [n];
		for(i=0;i<n;i++)
		  arr[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if (i==(n-1))
				arr[i]=0;
			else 
			{
				max=arr[i+1];
				for(j=1+2;j<n;j++)
					if(arr[j]>max)
						max=arr[j];
				arr[i]=max;
			}
		}
		for(i=0;i<n;i++)
			 System.out.print(arr[i]);

	}

}
