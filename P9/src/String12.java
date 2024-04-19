import java.util.StringJoiner;
import java.util.Scanner;
public class String12 {
public static void main(String[] args) {
	/*Scanner sc=new Scanner(System.in);
	String sb=sc.nextLine();
	StringTokenizer b=new StringTokenizer(sb);
	String s="";
	while(b.hasMoreElements()) {
		/*System.out.println(new StringBuffer(b.nextToken()).reverse());
	}
	}
String b1=b.nextToken();
String b2=" ";
for(int i=b1.length()-1;i>=0;i--) {
	b2+=b1.charAt(i);
	
}
s+=b2+" ";
}
	System.out.println(s);
}*/
	StringJoiner s=new StringJoiner(",");
   // s.add("hi");
    //s.add("hello");
	s.setEmptyValue("no");
    System.out.println(s);
}


	
}