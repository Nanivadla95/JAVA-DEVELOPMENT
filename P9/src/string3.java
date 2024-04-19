import java.util.*;
public class string3 {
	/*static boolean ispalin(String s) {
		int i=0;int j=s.length()-1;
		while(i<j/2) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			System.out.println(s.charAt(i));
			System.out.print(s.charAt(j));
			i++;
			j--;
		}
		return true;
		
	}*/
	public static void main(String[] args) {
		String s="a3b4";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				for(int j=1;j<=s.charAt(i)-48;j++) {
					
					s1+=s.charAt(i-1);
				}
			}
			
			
		}
		System.out.println(s1);
		

			/*String s=new String("moye");
			String s1=new String("");
			int i=0;
			int j=s.length()-1;
			while(i<s.length()) {
				s1=s1+s.charAt(j);
				j--;
				i++;
			}
			System.out.println(s1);
			if(s.equals(s1)) {
				System.out.println("same");
			}
			*/
	}
	
			

}
