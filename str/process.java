package str;
import java.util.Scanner;

public class process {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int ld=n%10;
	while(n>9)
		n =n/10;
	System.out.println(n+ld);
	

}
}