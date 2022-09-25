package Sept_19;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }

    //return the index of smallest no >=target
     static int ceiling(int[] arr, int target) {

        int len=arr.length-1;
        if (target>arr[len]){
            return -1;
        }
        int strat=0;
        int  end=arr.length-1;
        while (strat<=end){
            int mid=strat+(end-strat)/2;
            if (target<arr[mid])
            {
                end=mid-1;
            } else if (target>arr[mid]) {
                strat=mid+1;
            }else {
                return mid;
            }
        }
        return strat;
    }
}
