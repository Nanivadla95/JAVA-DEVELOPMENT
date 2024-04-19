import java.util.*;
public class Arrays2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[5];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		int i=1;
		while(i<=r) {
			int t=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) 
				arr[j]=arr[j-1];
			arr[0]=t;
			i++;
				
			
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]);
		}
	}

}
