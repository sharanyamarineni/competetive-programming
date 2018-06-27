import java.util.Arrays;

public class CoinChangeWays {
    public static int noOfWays(int[] denom,int money)
    {
        int[] arr=new int[money+1];
        arr[0]=1;
        for(int i=0;i<denom.length;i++)
        {
            for(int j=denom[i];j<arr.length;j++)
            {
                arr[j]=arr[j]+arr[j-denom[i]];
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int denom[] = {1,2,3};
        int amount = 5;
        System.out.println(noOfWays(denom,amount));
    }
}