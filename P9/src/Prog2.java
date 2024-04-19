import java.util.*;
public class Prog2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prog1 [] p=new Prog1[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<p.length;i++) {
			System.out.println("product"+(i+1)+"name");
			String pname=sc.nextLine();
			System.out.println("product"+(i+1)+"id");

			String pid=sc.nextLine();
			System.out.println("product"+(i+1)+"qty");

			int qty=Integer.parseInt(sc.nextLine());
			System.out.println("product"+(i+1)+"price");

			float price=Float.parseFloat(sc.nextLine());
			p[i]=new Prog1(pname,pid,qty,price);
		}
		for(int i=0;i<p.length;i++) {
			p[i].display();
		}
	}

}
