import java.util.*;
class Hamming{
static int[] decToBinary(int n)
    {
        int[] binaryNum = new int[256];
        int[] binNum = new int[256];
        int i = 0,count=0;
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            count++;
            i++;
        }
        int k=binaryNum.length-count;
        for (int j = i - 1; j >= 0; j--)
        {
            binNum[k]=binaryNum[j];
        	k++;
        }
        // System.out.println(Arrays.toString(binNum));
        return binNum;
    }
    static void testcases(int t1,int t2){
    	int[] arr=new int[8];
		int[] arr2=new int[8];
		arr=decToBinary(t1);
		arr2=decToBinary(t2);
		int c=0;
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]!=arr2[i]){
				c++;
			}
		}
		System.out.println(c);

    }
	public static void main(String[] args) {
		testcases(25,30);
		testcases(1,4);
		testcases(25,30);
		testcases(100,250);
		testcases(1,30);
		testcases(0,255);	
	}
}
