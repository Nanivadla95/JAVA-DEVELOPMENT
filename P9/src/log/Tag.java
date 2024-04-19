package log;
import java.util.Scanner;
public class Tag {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n,sum=0;
	n= sc.nextInt();
	int arr[] =new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	for(int i=0;i<n;i++)
		sum+=arr[i];
  System.out.print("sum of Array elemwnts"+sum);	
   }
}
