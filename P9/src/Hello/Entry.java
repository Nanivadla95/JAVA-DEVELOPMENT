package Hello;
import java.util.Scanner;
public class Entry {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
	int i,j,n,t;
     n = sc.nextInt();
	int arr[]= new int[n];
	for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
	for(i=0,j=arr.length-1;i<j;i++,j--)
	{
		t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
		
	}
	 for(i=0;i<n;i++)
		 System.out.print(arr[i]);
	
	
	
	}

}
