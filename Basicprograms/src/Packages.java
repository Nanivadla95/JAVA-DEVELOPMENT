
public class Packages {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		int c = 30;
		System.out.println("x: " + Packages.x);
		System.out.println("c  " + c);
		Packages ob = new Packages();
		System.out.println("ob-y : " + ob.y);

		Packages.x += 100;
		ob.y += 200;
		Packages ob2 = new Packages();
		System.out.println("x: " + Packages.x);
		System.out.println("ob-y : " + ob.y);
		System.out.println("ob2-y : " + ob2.y);

	}

}
