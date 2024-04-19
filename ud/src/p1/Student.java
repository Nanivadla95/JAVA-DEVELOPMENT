package p1;
public class Student {
	Marks m;
	String name,roll,email;
	long moblie;
	public Student(Marks m) {
		this.m = m;
	}
	void setDetails(String name,String roll,String email,Long mobile,int m1,int m2,int m3)
	{
		this.name = name;
		this.roll=roll;
		this.email=email;
		this.mobile=mobile;
		this.m.m1=m1;
		this.m.m2=m2;
		this.m.m3=m3;
		this.m.per=(m1+m2+m3)/3.0f;
		
	}
	public void getDetails()
	{
		System.out.println("name : "+this.name);
		System.out.println("roll : "+this.roll);
		System.out.println("email : "+this.email);
		System.out.println("moblie : "+this.mobile);
		System.out.println("m1 : "+this.m1);
		System.out.println("m2 : "+this.m2);
		System.out.println("m3 : "+this.m3);
		System.out.println("per : "+this.per);
	}
}
	
	
