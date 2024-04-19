package Crt;
import java.util.Scanner;

public class Highest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	  int i,j,n,max,smax;
	  n= sc.nextInt();
	  int arr[]=new int[n];
	  for(i=0;i<n;i++)
		  arr[i]=sc.nextInt();
	  max=arr[0];
	  for(i=1;i<n;i++)
		  if(arr[i]>max)
			  max=arr[i];
	  smax=(max!=arr[0])?arr[0]:arr[1];
	  for(i=1;i<n;i++)
		  if(arr[i]>smax && arr[i]!=max)
			  smax=arr[i];
	  System.out.print(smax);
		  
		
	}
		
}
