package inheritance;

public class SquareEquation extends LinearEquation
{
	private double a;
	
	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public SquareEquation() {
		super();//luôn ở đầu hàm, gọi hàm khởi tạo ko đối số của lớp cha
		this.a=0;
	}
	
	public SquareEquation(double a, double b, double c) {
		super(b,c);//luôn ở đầu hàm, gọi hàm khởi tạo có 2 đối số của lớp cha
		this.a=a;
	}
	
	void solve()
	{
		if(a==0)
			super.solve();//gọi hàm solve của lớp cha
		else {
			double delta = b*b - 4*a*c;
			if(delta<0) System.out.println("No solution");
//			if(delta==0) double x1 = 
		}
	}
}
