package array;

public class ArrayListOfInterger {
//	khai báo thuộc tính
	private int a[];
	private int n;
//	hàm khởi tạo không đối số
	public ArrayListOfInterger() {
		a= new int[10]; //a.length=10
		n=0;
//		System.out.println(n);
//		System.out.println(a.length); //độ dài của mảng
//		System.out.println(a); //in ra địa chỉ của a
	}
//	hàm khởi tạo có đối số
	public ArrayListOfInterger(int capacity) {
		a= new int[capacity];//a.length=capacity
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
	public void add(int x) {
//		trường hợp mảng đã đầy, biến mảng đã đầy thành chưa đầy
		if(n==a.length) {
			int b[] = new int[a.length * 2];
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
	
	public Integer get(int y) {
		if(y<0 || y>=n) 
			{
				System.out.println("error");
				return null;
			}
		return a[y];
	}
	
	public void set(int x, int y) {
		if(y<0 || y>n) 
			{
				System.out.println("error");
				return;
			}
		a[y]=x;		
	}
	
	public void addAnywhere(int x, int y) {
		if(y<0 || y>n) System.out.println("error");
//		trường hợp mảng đã đầy, biến mảng đã đầy thành chưa đầy
		if(n==a.length) {
			int b[] = new int[a.length * 2];
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
	
	public boolean contains(int x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return true;
		return false;
	}
	
	public Integer indexOf(int x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x) return i;
		return null;
	}
	
	public Integer lastIndexOf(int x) {
		for(int i=n;i>=0;i--)
			if(a[i]==x) return i;
		return null;
	}
	
//	public boolean remove(Integer o) {
//		
//	}
	
	public static void main(String[] args) {
		ArrayListOfInterger arr = new ArrayListOfInterger(10);
		arr.add(8);
		arr.add(20);
		arr.add(55);
		arr.output();
		
		arr.addAnywhere(3,3);
//		arr.addAnywhere(3,-7);
//		arr.addAnywhere(3,5);
		arr.output();
		
		arr.set(3, 2);
		arr.output();
		
		arr.remove(1);
		arr.output();
		
		System.out.println(arr.indexOf(8));
		
		System.out.println(arr.contains(8));
		
		System.out.println(arr.lastIndexOf(3));
//		arr.output();
	}
}
