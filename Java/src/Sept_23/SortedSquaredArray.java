package Sept_23;
/*
Given an array of integer in an unsorted order. Write a function that return a sorted
array containing the squares of those integers.

input : a={-6,-4,1,2,3,5}
output : [1,4,9,16,25,36]
 */
import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] array={-6,-4,1,2,3,5};
        SortedSquaredArray sqa=new SortedSquaredArray();
        //  System.out.println(Arrays.toString(sqa.answer(array)));

        System.out.println(Arrays.toString(sqa.answer2(array)));
    }
   /* int[] answer(int [] array){
        int[] squared_nums=new int[array.length];
        for (int i=0;i<array.length;i++){
            squared_nums[i]=array[i]*array[i];
        }
        Arrays.sort(squared_nums);
        return squared_nums;
    }*/

    int[] answer2(int[] array){
        int[] result=new  int[array.length];
        int left=0;
        int right=array.length-1;

        for (int i=right;i>=0;i--){
            if (Math.abs(array[left])>array[right]){
                result[i]=array[left]*array[left];
                left ++;
            }else {
                result[i]=array[right]*array[right];
                right --;
            }
        }
        return result;
    }
 }
