package exercies;

/*
In the popular Minesweeper game you have a board with some mines
and those cells that don't contain a mine have a number in it that
indicates the total number of mines in the neighboring cells.
 Starting off with some arrangement of mines we want to create a Minesweeper game setup.

 */



public class MineSweeper {


    public static void main(String[] args) {

        boolean [][] matrix={{true,false,false},{false,true,false},{false,false,false}};
        System.out.println(minesweeper(matrix));
    }


 static    int[][] minesweeper(boolean[][] matrix) {
        int[][] sol = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                for (int ii = Math.max(0,i - 1); ii <= Math.min(i + 1,matrix.length-1) ; ii++)
                    for (int jj = Math.max(0,j - 1); jj <= Math.min(j + 1,matrix[0].length-1); jj++) {
                        if (matrix[ii][jj] && (i!=ii || jj!=j)) {
                            sol[i][j]++;
                        }
                    }

        return sol;
    }

}
