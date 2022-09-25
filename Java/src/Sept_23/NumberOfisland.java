package Sept_23;
/*
Given a 2d grid  map of '1's (land) and '0's (water),count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

input:
11110
11010
11000
00000


output: 1

input:
11000
11000
00100
00011

output: 3
 */

public class NumberOfisland {
    public static void main(String[] args) {

    }
    public int answer(char[][] grid){
        int count=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if (grid[i][j]=='1'){
                    count +=1;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }
    public void callBFS(char[][] grid,int i,int j){
        //if (i<0`1)
    }

}
