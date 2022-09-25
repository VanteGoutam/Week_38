package Sept_19;
//Yet to solve


/*


Description

Sapna who works in Fac-G is going to participate in a contest on the same day as Sasken's Christmas Bash.
The contest starts at 1:00 PM and ends at 5:00 PM.
The contest contains n problems, sorted by difficulty level, i.e.
problem 1 being the easiest and problem n being the hardest one.
Sapna knows that it will take her 5xi minutes to solve the i-th problem.
Sapna is participating in this contest in Fac-G, but she really wants to attend Sasken's Christmas Bash,
which starts at 5:00 PM in Fac-Z.
So she wants to be in Fac-Z at 5:00 PM or earlier.
Based on the Traffic that day she needs k minutes to get to Fac-Z from Fac-G.

How many problems can Sapna solve if she wants to make it to the Christmas Bash Event at Fac-Z?
Input

The only line of the input contains two integers n and k (1 ≤ n ≤ 10, 1 ≤ k ≤ 240) — the number of the problems in the contest and the number of minutes Sapna needs to get to the Christmas Bash from Fac-G.
Output

Print one integer, denoting the maximum possible number of problems Sapna can solve so that she could get to the Event at
5:00 PM or earlier.
Sample input

3 222
4 190
7 1

Sample output

2
4
7

 */
public class ChristmasRush {
    public static void main(String[] args) {
        int[] problems ={1,2,3,4,5};
        int trafic_tiime=222;
        ChristmasRush cr=new ChristmasRush();
        System.out.println(cr.answer(problems,trafic_tiime));
    }
    int answer(int[] problems,int trafic_time){
        int strat=0;
        int  end=4*60;
        int req_time=strat+end;
        if (req_time>end){
            return -1;
        }
        while (req_time<=240){
            for (int i=0;i<problems.length;i++){
                int time_solve=problems[i]*5;
                req_time=trafic_time+time_solve;

                if (req_time<=240){
                    return time_solve;
                }
            }
        }
        return req_time;
    }
}
