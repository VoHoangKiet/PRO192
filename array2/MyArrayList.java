
package array;

public class MyArrayList<E> {
    E a[];
    private int n;

    public MyArrayList() 
    {
        a = (E[]) new Object[10];
        n = 0;
    }
    public MyArrayList(int capacity) 
    {
        a = (E[]) new Object[capacity];
        n = 0;
    }
    public boolean isEmpty() 
    {
        return (n == 0);
    }
    public int size()
    {
        return n;
    }
    public void add(E x)
    {
        if(n==a.length)
        {
            E b[] = (E[]) new Object[a.length*2];
            for (int i=0;i<a.length;i++){
                b[i]=a[i];
            }
            a=b;
        }
        a[n++]=x;
    }
    public void output()
    {
        for(int i=0;i<n;i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
    public void add(E x, int index)
    {
        if (index < 0 || index > n) {
            System.out.println("Error");
            return;
        }
        if(index>0 || index<n)
        {
            if(n==a.length)
            {
                E b[] = (E[]) new Object[a.length*2];
                for(int i=0;i<a.length;i++)
                {
                    a[i]= b[i];
                }
                a=b;
            }
            for(int i=n;i>index;i--)
            {
                a[i]=a[i-1];
            }
        }
        a[index] = x;
        n++;
    }
    public void set(E x, int index)
    {
        if (index > 0 || index <= a.length)
            a[index] = x;   
        else
            return;    
    }
    public E get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            return null;
        }
        return a[index];
    }
    public void remove(int index){
        if(index<0 || index>=n)
        {
            System.out.println("Error");
            return ;
        }
        for(int i=index; i<n-1; i++){
            a[i] = a[i+1]; 
        }
        n--;
    }
    public boolean contains(E x) {
        for (int i = 0; i < n; i++) {
            if (x.equals(a[i]))
                return true;
        }
        return false;
    }
    public int indexOf(E x) {
        for (int i = 0; i < n; i++) {
            if (x.equals(a[i]))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(E x) {
        for (int i = n - 1; i >= 0; i--) {
            if (x.equals(a[i]))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        MyArrayList<Integer> ha = new MyArrayList();
        ha.add(10);
        ha.add(9);
        ha.add(8);
        ha.add(7);
        ha.add(6);
        ha.output();
        
    }

    void set(int j, Rectangle get) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
