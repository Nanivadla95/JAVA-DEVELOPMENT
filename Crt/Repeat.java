package Crt;
import java.util.Scanner;
public class Repeat {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
 String s =sc.nextLine();
 String r="";
	int i,j;
	for(i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=48 && s.charAt(i)<=57)
		{
			for(j=1;j<=s.charAt(i)-'0';j++)
		         r+=s.charAt(i-1);
			
		}
		
	  }
	System.out.print(r);
	}	
	
}

