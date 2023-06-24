package shape;

public class Square extends Rectangle1
{
	public Square() {
		super();
	}

	public Square(double edge) {
		super(edge,edge);
	}
	
	public static void main(String[] args) {
		Square s = new Square(5);
		System.out.println(s.areaCalc());
		System.out.println(s.perimeterCalc());
	}
}
