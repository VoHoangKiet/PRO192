package array;

public class ArrayListOfDouble {
//	khai báo thuộc tính
	private double a[];
	private int n;
//	hàm khởi tạo không đối số
	public ArrayListOfDouble() {
		a= new double[10]; //a.length=10
		n=0;
//		System.out.println(n);
//		System.out.println(a.length); //độ dài của mảng
//		System.out.println(a); //in ra địa chỉ của a
	}
//	hàm khởi tạo có đối số
	public ArrayListOfDouble(int capacity) {
		a= new double[capacity];//a.length=capacity
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
	public void add(double x) {
//		trường hợp mảng đã đầy, biến mảng đã đầy thành chưa đầy
		if(n==a.length) {
			double b[] = new double[a.length * 2];
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
	
	public Double get(int y) {
		if(y<0 || y>=n) 
			{
				System.out.println("error");
				return null;
			}
		return a[y];
	}
	
	public void set(double x, int y) {
		if(y<0 || y>n) 
			{
				System.out.println("error");
				return;
			}
		a[y]=x;		
	}
	
	public void addAnywhere(double x, int y) {
		if(y<0 || y>n) System.out.println("error");
//		trường hợp mảng đã đầy, biến mảng đã đầy thành chưa đầy
		if(n==a.length) {
			double b[] = new double[a.length * 2];
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
		a[--n]=0;
	}
	
	public boolean contains(double x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return true;
		return false;
	}
	
	public Integer indexOf(double x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return i;
		return null;
	}
	
	public Integer lastIndexOf(double x) {
		for(int i=n;i>=0;i--)
			if(a[i]==x) return i;
		return null;
	}
	
//	public boolean remove(Integer o) {
//		
//	}
	
	public static void main(String[] args) {
		ArrayListOfDouble arr = new ArrayListOfDouble(10);
		arr.add(8.3);
		arr.add(20.5);
		arr.add(55.7);
		arr.output();
		
		arr.addAnywhere(3.1,3);
//		arr.addAnywhere(3,-7);
//		arr.addAnywhere(3,5);
		arr.output();
		
		arr.set(3.4, 2);
		arr.output();
		
		arr.remove(1);
		arr.output();
		
		System.out.println(arr.indexOf(8));
		
		System.out.println(arr.contains(8));
		
		System.out.println(arr.lastIndexOf(3));
//		arr.output();
	}
}