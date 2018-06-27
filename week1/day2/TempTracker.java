public class TempTracker {
    Integer size,res;
    Integer max,min;
    Integer mode;
    int[] arr=new int[111];
    public TempTracker()
    {
        size=0;
        res=0;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        mode=0;
    }
    public void insert(Integer temp)
    {
        if(temp>=0)
        {
            res=res+temp;
            if(max<temp)
            {
                max=temp;
            }
            if(min>temp)
            {
                min=temp;
            }
            arr[temp]++;
            if(arr[temp]>arr[mode])
            {
                mode=temp;
            }
            size++;
        }
    }
    public Integer get_min()
    {
        if(size>0)
            return min;
        else
            return null;
    }
    public Integer get_max()
    {
        if(size>0)
            return max;
        else
            return null;
    }
    public Integer get_mode()
    {
        if(size>0)
            return arr[mode];
        else
            return null;
    }
    public Double get_mean()
    {
        if(size>0)
        {
            return Double.parseDouble(res/size+"");
        }
        else
            return 0.0;
    }
    public static void main(String[] args) {
        TempTracker t=new TempTracker();
        t.insert(8); 
        t.insert(2); 
        t.insert(3); 
        t.insert(2); 
        t.insert(5); 

        System.out.println(t.get_max());
        System.out.println(t.get_min());
        System.out.println(t.get_mode());
        System.out.println(t.get_mean());
    }
}
