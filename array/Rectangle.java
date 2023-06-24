package array;

import java.util.Scanner;

import validate.Validate;

public class Rectangle {
//	khai bao cac attribute chung
	double length, width;
	
	public Rectangle() {
	this.length = 0;
	this.width = 0;
}
	
	public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	//	khai bao cac attribute rieng
	double areaCalc()
	{
		return length*width;
	}
	double perimeterCalc()
	{
		return (length+width)*2;
	}
	@Override
    public String toString() {
        return this.length + ", "+ this.width;
    }
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		double dai = 0;
		while(dai<0) {
			System.out.println("Enter length >0!!");
			dai = sc.nextDouble();
		}
		setLength(dai);
		double rong = 0;
		while(rong<0) {
			System.out.println("Enter width >0!!");
			rong = sc.nextDouble();
		}
		setWidth(rong);
	}
	
	public void input2() {
		setLength(Validate.inputDouble("length", 0));
		setWidth(Validate.inputDouble("width", 0));
	}
	
public static void main(String[] args) 
	{
//	tao cac doi tuong rieng: dua tren attribute va method chung lai co gia tri rieng
	Rectangle rec = new Rectangle();
	System.out.println(rec);
	rec.length = 30;
	rec.width = 10;
	System.out.println("Area of rectangle: " + rec.areaCalc()); //300
	System.out.println("Perimeter of rectangle: " + rec.perimeterCalc()); //80
	
	Rectangle rec2 = new Rectangle(40,20);
	System.out.println(rec2);
//	rec2.length = 40;
//	rec2.width = 20;
	System.out.println("Area of rectangle 2: " + rec2.areaCalc()); //800
	System.out.println("Perimeter of rectangle 2: " + rec2.perimeterCalc()); //120
	} 
}
