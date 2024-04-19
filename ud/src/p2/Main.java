package p2;
public class Main{
float radius=30.00f;
float area;
public Main(){
	this.radius=60.54f;
}
Main(float radius){
	this.radius=radius;
	
}

public String toString() {
	return String.valueOf(this.radius);
}
public boolean equlas(Main c) {
	return this.radius == c.radius; 
}
public float Area(){
	return (float)Math.PI*this.radius*this.radius;
}
public float Area(Main c1){
	return (float)Math.PI*c1.radius*c1.radius;
}
public static void main(String[] args) {
	System.out.print(new Main(34.00f).toString());
	Main c1=new Main(23.45f);
	Main c2=new Main(23.45f);
	System.out.println(c1.equlas(c2));
	System.out.println(c1.Area());

	
	
	
	
}
}



	