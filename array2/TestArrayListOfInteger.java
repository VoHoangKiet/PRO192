
package array;

public class TestArrayListOfInteger extends MyArrayList<Integer>{
    
    public int sum()
    {
        int s=0;
        for(int i=0;i<size();i++)
            s=s+ get(i);
        return s;
    }
    public double average()
    {
        int s=0,d=0;
        for(int i=0;i<size();i++){
            if( isPrime((int) get(i))){
                s+=get(i);
                d++;
            }
        }
        return 1.0*s/d;
    }
    private boolean isPrime(int x)
    {
        if(x<2) return false;
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x%i==0) return false;
        return true;
    }
    public int maxValue(){
        int max = get(0);
        for(int i=0; i< size(); i++)
        {
            if(max<get(i)) max= get(i);
        }
        return max;
    } 
    public int maxSum(){
        int  max= get(0)+get(1);
        for(int i=1;i<size()-1; i++)
        {
            if(max< get(i)+get(i+1))
                max= get(i)+get(i+1);
        }
        return max;
    }
    public void sortIncrease(){
      
        for (int i=0; i<size()-1; i++)
        {
            int temp = get(i);
            for(int j = size()-1; j>i; j--)
            {
                if(temp> get(j))
                {
                   set(j,temp);
                   set(i,get(j));
                   temp = get(j);
                }
            }
        }
    }
    public static void main(String[] args) {
        TestArrayListOfInteger ha = new TestArrayListOfInteger();
        ha.add(6);
        ha.add(9);
        ha.add(7);
        ha.add(8);
        ha.add(5);
        ha.add(10);
        System.out.println(ha.average());
        System.out.println(ha.sum());
        System.out.println(ha.maxValue());
        System.out.println(ha.maxSum());
        ha.sortIncrease();
        ha.output();
    }
}
