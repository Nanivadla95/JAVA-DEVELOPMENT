package Crt;

import java.util.Scanner;

public class Colums {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];		
  int i,j,c=1,sum=0;
  for(i=0;i<arr.length;i++)
  {
	  for (j=0;j<arr[i].length;j++)
	  arr[i][j]=c++;
	 
  }
   for(i=0;i<arr.length;i++)
   {
	   sum=0;
	   for(j=0;j<arr[i].length;j++)
			   sum =arr[i][j];
	   
   }
	   System.out.print(sum);
	}

}
