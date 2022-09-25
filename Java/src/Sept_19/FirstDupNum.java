/*
package Sept_19;
*/
/*
Given an array  a that contains only numbers in the range from i to a.length, find
the first duplicate numbers for which the second occurrence
 has the minimal index. In other words
  If,there are more than 1 duplicated numbers,return the number for which the second occurrence of
  has a smaller index than the second occurrence of the other number does,If there ae no
  such elements, return -1;




  input a={2,1,3,5,3,2}----------------output=3

  input a=[2,2]------------------------output=2

  input a=[2,4,3,5,1]------------------output=-1
  *//*


public class FirstDupNum {
    public static void main(String[] args) {

        int[] a={2,1,3,5,3,2};
        FirstDupNum fd=new FirstDupNum();
        System.out.println(fd.firstDupValue(a));
    }
    int firstDupValue(int[] a){
        int min_second_index=a.length;
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    min_second_index=Math.min(min_second_index,j);
                }
            }
        }
        if (min_second_index==a.length)
            return -1;
        else
            return a[min_second_index];
    }

}*/
