
public class Circle {
float radius=30.00f;
float area;
Circle(){
	this.radius=60.54f;
}
Circle(float radius){
	this.radius=radius;
	
}
public static void equals(float c1,float c2) {
	if(c1 == c2) {
	
		System.out.println("same");

		
	}
	else {
		System.out.print("not same");
	}
}
 public float Area(){
	area=3.14f*radius*radius;
	return area;
	
}
public String toString() {
	return "radius="+radius+"";
}
public static void main(String[] args) {
	System.out.print(new Circle(34.00f).toString());
	Circle c1=new Circle(23.45f);
	Circle c2=new Circle(23.45f);
	Circle.equals(23.45f,23.45f);
	Circle c=new Circle(23.45f);
	//c1.Area();
	c1.Area();


	
}
}
