package circle;

public class Circle {
//	khai bao cac attribute chung
	private double radius;
	public void setLength(double l) 
	{
		if(l<0) length=0;
		else length= l;
	}
//	khai bao cac attribute rieng
	public double perimeterCalc()
	{
		return 2*radius*Math.PI;
	}
	public double areaCalc()
	{
		return Math.pow(radius, 2)*Math.PI;
	}
	public static void main(String[] args) 
	{
//	tao cac doi tuong rieng: dua tren attribute va method chung lai co gia tri rieng
	Circle cir= new Circle();
	System.out.println(cir);
	cir.radius = 30;
	System.out.println("Area of circle: " + cir.areaCalc()); //300
	System.out.println("Perimeter of circle: " + cir.perimeterCalc()); //80
	
	Circle cir2 = new Circle();
	System.out.println(cir2);
	cir2.radius = 40;
	System.out.println("Area of circle 2: " + cir2.areaCalc()); //800
	System.out.println("Perimeter of circle 2: " + cir2.perimeterCalc()); //120
	} 
}
