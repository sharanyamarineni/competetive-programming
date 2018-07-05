import java.util.Arrays;

class CakeType {

    final int weight;
    final int value;

    public CakeType(int weight, int value) {
        this.weight = weight;
        this.value  = value;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getValue() {
        return value;
    }
}
public class CakeThief {
    public int maxDuffelBagValue(CakeType[] cakeTypes,int weightCapacity)
    {
        int[] cost=new int[weightCapacity+1];
        int length=cakeTypes.length;
        for(int i=0;i<=weightCapacity;i++)
        {
            for(int j=0;j<length;j++)
            {
                if(cakeTypes[j].getWeight()<=i)
                {
                    cost[i]=Math.max(cost[i],cost[i-cakeTypes[j].getWeight()]+cakeTypes[j].getValue());
                }
            }
        }
        //System.out.println(Arrays.toString(cost));
        return cost[weightCapacity];
    }
    public static void main(String[] args) {

        CakeType[] cakes={new CakeType(5, 1),new CakeType(2, 3),new CakeType(3, 6),new CakeType(6, 1), new CakeType(7, 1), new CakeType(8, 1)};
        
        int weightCapacity=7;
        
        CakeThief ct=new CakeThief();
        System.out.println(ct.maxDuffelBagValue(cakes,weightCapacity));

    }

}