import java.util.*;
public class Arrays1 {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int arr1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++) {
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		for(int i=n;i<=n1;i++) {
			arr[i+1]=arr[i];
		}
		int j=sc.nextInt();			
		for(int i=0;i<n1;i++) {
			if( i ==j) {
				arr[i]=99;
			}
		
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
		

}
}
