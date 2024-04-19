package str;
import java.util.*;
class Student extends Marks{
	String name;
	int roll;
	String email;
	public Student(String n,int r,String e,int m,int p,int s){
		super(m,p,s);
		this.name=n;
		this.roll=r;
		this.email=e;
		this.per=((m+p+s)/3.0f);
		
		
	}
}
public class P9 {
		public static void main(String[] args) {
			Student a[]=new Student[5];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<3;i++) {
				System.out.println("Enter Student"+(i+1)+" Details");
				System.out.print("Enter Name:");
				String n=sc.nextLine();
				System.out.print("Enter Email:");

				String e=sc.nextLine();
				System.out.print("Enter Roll:");
				int r=Integer.parseInt(sc.nextLine());
				System.out.print("Enter Marks\n");
				int m=Integer.parseInt(sc.nextLine());
				int p=Integer.parseInt(sc.nextLine());
				int s=Integer.parseInt(sc.nextLine());
				a[i]=new Student(n,r,e,m,p,s);
			System.out.println("\n");
			}
			for(int i=0;i<3;i++) {
				System.out.print(a[i].name+"\n"+a[i].roll+"\n"+a[i].email+"\n"+a[i].ma+" "+a[i].ph+" "+a[i].so+"\n"+a[i].per+"\n\n");
			}
		}

	
		
}

