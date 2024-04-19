public class Product {
	static int count;
	String pid,pname;
	float price;
	public Product() {
		this.pid="a21";
		this.pname="bhava";
		this.price=34.56f;
	
	}
	static {
		count=0;
	}{
		count++;
	}
	Product(String pid,String pname,float price){
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	
	public void print(){
		System.out.println(this.pid);
		System.out.print(this.pname);
		System.out.print(this.price);
	}
	public String toString(){
	return "pid="+pid+"pname"+pname+"price"+price;
		
	}
	public static void main(String[] args) {
		Product p1=new Product("a123","gree",23.45f);
		Product p2=new Product();
		p1.print();
		p2.print();
		System.out.println("count="+count);
	
		
	}

}
