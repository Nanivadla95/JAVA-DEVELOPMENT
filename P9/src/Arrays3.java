import java.util.Scanner;
public class Arrays3{
	public static void main(String[] args) {
		int arr[][]= new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[3];
	    arr[2]=new int[3];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
					arr[i][j]=c++;
			}
			}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i == j)
				    sum+=arr[i][j];
			    //System.out.print(sum);
			}
			
			 System.out.print(sum);
				    System.out.println();
			}

		}
	}
	