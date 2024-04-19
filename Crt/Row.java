package Crt;
import java.util.Scanner;
public class Row {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [2][];
		int i,j;
		arr[0]=new int[3];
		arr[1]=new int[2];
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
				arr[i][j]= sc.nextInt();
	
		}
		 
		for(i=0;i<arr.length;i++)
		{
		
		for(j=0;j<arr[i].length;j++)
		System.out.print(arr[i][j]+"");
		System.out.println();
		
		}
		
		
	}

}
