package str;
import java.util.Scanner;
public class Doll {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t1=1,t2=1,nt=0;
    for(int i=1;i<=n-1;i++)
    {
    	nt=t1+t2;
    	t1=t2;
    	t2=nt;
    }
    System.out.println(nt);
		
	}

}
