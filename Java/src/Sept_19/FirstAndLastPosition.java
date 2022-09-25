package Sept_19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        FirstAndLastPosition firstAndLastPosition=new FirstAndLastPosition();
        int[] nums={1,2,3,5,4,78,3};
        int target=5;
        System.out.println(Arrays.toString(firstAndLastPosition.searchRange(nums,target)));
    }
    public int[] searchRange(int [] nums,int target){
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if (ans[0] !=-1){
            ans[1] =search(nums,target,false);
        }
        return ans;
    }

     int search(int[] nums, int target, boolean findStartIndex) {

        int ans=-1;
        int  start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }else if (target> nums[mid]){
                start=mid+1;
            }else {
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
