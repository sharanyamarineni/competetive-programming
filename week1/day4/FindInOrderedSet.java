public class FindInOrderedSet {
    public boolean binarySearch(int arr[],int item){
        return search(arr,0,arr.length-1,item);
    }
    public boolean search(int arr[],int low,int high,int item){
        int mid;

        while(low<=high){
            mid = (high+low)/2;
            if (arr[mid]==item) {
                return true;
            }

            if(arr[mid]>item){
                high=mid-1;
            }
            else {
                low = mid+1;
            }

        }

        return false;
    }
    public static void main(String[] args) {

        int arr[]={1,2,6,8,10};
        int item = 1;
       FindInOrderedSet obj=new FindInOrderedSet();
        System.out.println(obj.binarySearch(arr,item));
    }
}