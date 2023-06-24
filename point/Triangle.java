package point; 

import java.util.Scanner;

public class Triangle {
	private Point p1,p2,p3;
	
	public Triangle() {
		this.p1= new Point();
		this.p2= new Point();
		this.p3= new Point();
	}

	public Triangle(Point p1, Point p2, Point p3) {		
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	public void input() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter x of point 1: ");
	    p1.setX(myObj.nextDouble());  // Read user input
	    System.out.println("Enter y of point 1: ");
	    p1.setY(myObj.nextDouble());  // Read user input
	    System.out.println("Enter x of point 2: ");
	    p2.setX(myObj.nextDouble());  // Read user input
	    System.out.println("Enter y of point 2: ");
	    p2.setY(myObj.nextDouble());  // Read user input
	    System.out.println("Enter x of point 3: ");
	    p3.setX(myObj.nextDouble());  // Read user input
	    System.out.println("Enter y of point 3: ");
	    p3.setY(myObj.nextDouble());  // Read user input
	}
	
	public void output() {
		System.out.println(this.p1.getX() + "," + this.p1.getY() );
		System.out.println(this.p2.getX() + "," + this.p2.getY() );
		System.out.println(this.p3.getX() + "," + this.p3.getY() );
	}	
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.input();
		 System.out.println("Area of 3 point: " + t1.p1.area(t1.p2, t1.p3));
         System.out.println("Perimeter of 3 point: " + t1.p1.perimeter(t1.p2, t1.p3));
	}
}
