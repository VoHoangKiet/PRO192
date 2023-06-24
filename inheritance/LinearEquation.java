package inheritance;

public class LinearEquation {
	protected double b,c;

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	public LinearEquation() {
		this.b=0;
		this.c=0;
	}
	public LinearEquation(double b, double c) {
		this.b=b;
		this.c=c;
	}
	void solve() {
		if(b==0)
			if(c==0) System.out.println("vố số nghiệm");
			else System.out.println("vô nghiệm");
		else System.out.println("nghiệm x= " + (-c/b));
	}
	public static void main(String[] args) {
		LinearEquation dai = new LinearEquation();
		
		
	}
}
