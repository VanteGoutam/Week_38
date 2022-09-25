package Sept_22;
/*
Given an array of integers, find the sum of it's elements,
for example, if the array ar={1,2,3}, 1+2+3=6,so return 6

function description

Complete the simpleArraySm function in the editor below. It must return the sum of the array elements as an integer
simpleArraySum has the following parameter(s)
. ar:an array of integers


Input format
The first line contains an integer,n, denoting the size of the array.
The second line contains n space-separated integers representing the array's elements.

Constraints

0<n,ar[i]<=100

Output format
Print the sum of the array's elements as a single integer.


Sample input
6
1 2 3 4 10 11



 */
public class SimpleArraySum {
    public static void main(String[] args) {
        int[] ar={1,2,3};
        System.out.println(answer(ar));
    }
    static int answer(int [] ar){
        int ar_sum=0;
        for (int i=0;i<ar.length;i++){
            ar_sum +=ar[i];
        }
        return ar_sum;
    }
}
