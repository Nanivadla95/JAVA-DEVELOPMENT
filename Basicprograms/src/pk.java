
class Marks{
	int ma,ph,so;
	public Marks(int m,int p,int s){
		this.ma=m;
		this.ph=p;
		this.so=s;
	}
}
class Student{
	String name;
	int roll;
	String email;
	String dep;
	Marks m;
	public Student(String n,int r,String e,String d,Marks x){
		this.name=n;
		this.roll=r;
		this.email=e;
		this.dep=d;
		this.m=x;
		
	}
}
public class pk {
		public static void main(String[] args) {
			Student a=new Student("Praveen",21,"sadfasw","adf",new Marks(1,2,3));
		}

	
		
}
