
public class Prog1 {
String name,id;
int qty;
float price;
Prog1(String pname,String pid,int qty,float price){
	name=pname;
	id=pid;
	this.qty=qty;
	this.price=price;
}
public void display() {
	System.out.println("name");
	System.out.println(this.name);
	System.out.println("id");
	System.out.println(this.id);
	System.out.println("qty");
	System.out.println(this.qty);
	System.out.println("price");
	System.out.println(this.price);
}
}
