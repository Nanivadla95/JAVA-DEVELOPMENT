import java.util.*;
import java.lang.*;
public class string2 {
	public static void main(String[] args) {
	//String s="1 2 3";
	//String arr[]=s.split(" ");
	//for(String s1:arr) {
		//System.out.println(s1);
	//}

		String s="mom";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
			
			
		}
		System.out.println(s1);
		if(s1.equals(s)) {
			System.out.println("same");
		}

	

}
}
		
