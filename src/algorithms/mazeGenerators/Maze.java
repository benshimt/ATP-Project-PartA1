package algorithms.mazeGenerators;

public class Maze {
    int row;
    int col;
    int[][] maze;


    public Maze(int r, int c) {
        row=r;
        col=c;
        maze=new int[row][col];
    }

    public void setmaze(int[][] Nmaze){
        maze=Nmaze;
    }

}
