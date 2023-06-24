package array;

public class VariableArrayList <E>{

//	khai báo thuộc tính
	protected E a[];
	private int n;
//	hàm khởi tạo không đối số
	public VariableArrayList() {
		a= (E[]) new Object[10]; //a.length=10
		n=0;
//		System.out.println(n);
//		System.out.println(a.length); //độ dài của mảng
//		System.out.println(a); //in ra địa chỉ của a
	}
//	hàm khởi tạo có đối số
	public VariableArrayList(int capacity) {
		a= (E[]) new Object[capacity];//a.length=capacity
		n=0;
//		System.out.println(n);
//		System.out.println(a.length); //độ dài của mảng
//		System.out.println(a); //in ra địa chỉ của a
	}
	public boolean isEmpty() {
		return(n==0);
	}
	public int size() {
		return n;
	}
	public void add(E x) {
//		trường hợp mảng đã đầy, biến mảng đã đầy thành chưa đầy
		if(n==a.length) {
			E b[] = (E[]) new Object[a.length * 2];
//			di chuyển các phần tử mảng a sang mảng b
			for(int i=0;i<a.length;i++)
				b[i]=a[i];
//			gán địa chỉ của b sang a, vì ra khỏi hàm b biến mất
			a=b;
		}
//		chèn x vào cuối mảng
		a[n++]=x;
	}
	
	public void output() {
		for(int i =0; i<n; i++) {
			System.out.println(a[i] + "  ");	
	}
		System.out.println();
	}
	
//	@Override
//    public String toString() {
//        return this.length + ", "+ this.width;
//    }
	
	public E get(int y) {
		if(y<0 || y>=n) 
			{
				System.out.println("error");
				return null;
			}
		return a[y];
	}
	
	public void set(E x, int y) {
		if(y<0 || y>n) 
			{
				System.out.println("error");
				return;
			}
		a[y]=x;		
	}
	
	public void addAnywhere(E x, int y) {
		if(y<0 || y>n) System.out.println("error");
//		trường hợp mảng đã đầy, biến mảng đã đầy thành chưa đầy
		if(n==a.length) {
			E b[] = (E[]) new Object[a.length * 2];
//			di chuyển các phần tử mảng a sang mảng b
			for(int i=0;i<a.length;i++)
				b[i]=a[i];
//			gán địa chỉ của b sang a, vì ra khỏi hàm b biến mất
			a=b;
		}
		for(int i = n;i>=y; i--) 			
			{
				a[i+1]=a[i];
				if(i==y) a[y]=x;	
			}
		n++;
	}
	
//	8 lớp bao bọc? Mục đich? Lớp bao bọc khác kiểu cơ bản chỗ nào? Auto-boxing/auto-unboxing?
	
	public void remove(int y) {
		if(y<0 || y>=n) 
		{
			System.out.println("error");
			return;
		}
		for(int i = y;i<n-1;i++)
			a[i] = a[i+1];
		a[--n]=null;
	}
	
	public boolean contains(E x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return true;
		return false;
	}
	
	public Integer indexOf(E x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return i;
		return null;
	}
	
	public Integer lastIndexOf(E x) {
		for(int i=n;i>=0;i--)
			if(a[i]==x) return i;
		return null;
	}
	
	public double maxArea() {
		double max=0;
		for(int i=0;i<n;i++)
			if(((Rectangle)a[i]).areaCalc() > max) max = ((Rectangle)a[i]).areaCalc();
		return max;
	}
	
	public double maxSum2Perimeter() {
		double max2 = 0;
		for(int i=0;i<n-1;i++)
			if(((Rectangle)a[i]).areaCalc() + ((Rectangle)a[i+1]).areaCalc() > max2) max2 = ((Rectangle)a[i]).areaCalc() + ((Rectangle)a[i+1]).areaCalc();
		return max2;
	}
	
	public void assortWidth() {
		for(int i=0;i<n	;i++)
			for(int f=0;f<n-i-1;f++)
				if(((Rectangle)a[f]).getWidth()>((Rectangle)a[f+1]).getWidth()) {
					E temp = a[f];
			        a[f] = a[f + 1];
			        a[f + 1] = temp;
				}
	}
	
//	public void outputAssortedWidth() {
//		for(int i=0;i<a.length;i++)
//			System.out.println();
//	}
	
	public static void main(String[] args) {
		VariableArrayList<Rectangle> arr = new VariableArrayList/*<Integer>*/();
		Rectangle a = new Rectangle(8,4);
		Rectangle b = new Rectangle(2,10);
		Rectangle c = new Rectangle(5,5);
		Rectangle d = new Rectangle(3,3);
		arr.add(a);
		arr.add(b);
		arr.add(c);
		arr.add(d);
		arr.output();
		System.out.println(arr.maxArea());
		System.out.println(arr.maxSum2Perimeter());
		arr.assortWidth();
		arr.output();
//		tính trung bình cộng các số nguyên tố trong đối tượng mảng arr
}
}
