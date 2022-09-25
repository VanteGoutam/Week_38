package Sept_19;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int target=3;
        BinarySearch bns=new BinarySearch();
        System.out.println(bns.bs(nums,target));
    }
    int bs(int[] nums,int target){
        int start=0;
        int end=nums.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
