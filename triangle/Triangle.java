package triangle;

public class Triangle
{
	public static double distance(double xa, double ya, double xb, double yb) 
	{
		return Math.sqrt(Math.pow(xa-xb, 2) + Math.pow(ya-yb, 2));
	}
	public static double areaCalc(double xa, double ya, double xb, double yb, double xc, double yc) 
	{
		double ab = distance(xa, ya, xb, yb);
		double ac = distance(xa, ya, xc, yc);
		double bc = distance(xb, yb, xc, yc);
		if(ab+ac<bc || ac+bc<ab || ab+bc<ac) return -1;
		double p= (ab+bc+ac)/2;
		return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
	}
	public static void main(String[] args)	
	{
//		System.out.println("Hello everyone.");
//		System.out.println("Hello everyone 2.");
//		System.out.println("Hello everyone 3.");
//		System.out.println("Hello everyone 4.");
//		double ab = distance(0,0,3,3);
//		System.out.println("Khoang cach giua 2 diem a va b la: " + ab);
		if(areaCalc(0,0,0,0,7,7) == -1) System.out.println("Not a triangle!"); 
		else System.out.println("Area of triangle: " + areaCalc(0,0,0,0,7,7));
	}
}
