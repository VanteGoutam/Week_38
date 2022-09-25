package Sept_21;
/*
Description

You are playing a game with your friend.

This game consists of a string, consisting only of english letters. During a player's turn, he/she should choose two consecutive equal letters in the string and delete them.

Eg: if the string is equal to "abbcd" than there is only one possible move: delete "bb", the string will then become "acd".

The player not able to make a turn loses.

Your task is to determine whether you will win if both you and your friend play optimally.

The game always starts with your turn first.
Input

The only line contains the string s, consisting of english letters. The string's length will be in range of 1 to 100000 (both inclusive)
Output

Output One word string

"Yes" if you are going to win

"No" if you are not going to win
Sample input

lgsdy
weep
noon

Sample output

No
Yes
No

 */

import java.util.Stack;

public class StringGame {
    public String findWinner(String s)
    {
        int i, count = 0, n;
        n = s.length();
        Stack<Character> st = new Stack<Character>();

        String ans=" ";
        for (i = 0; i < n; i++)
        {

            if (st.isEmpty() ||
                    st.peek() != s.charAt(i))
            {
                st.push(s.charAt(i));
            }
            else
            {
                count++;
                st.pop();
            }
        }

        // Check who has won
        if (count % 2 == 0)
        {
            ans="No";
        }
        else
        {
            ans="Yes";
        }
        return  ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "noon";

        StringGame sg=new StringGame();
        System.out.println(sg.findWinner(s));
    }
}
