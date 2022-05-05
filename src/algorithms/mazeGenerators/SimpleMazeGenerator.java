package algorithms.mazeGenerators;

import java.util.Random;

public class SimpleMazeGenerator extends AmazeGenerator {
    @Override
    public Maze generate(int r , int c) {
        Maze maze=new Maze(r,c);

        Random R = new Random( );
        int[][] nmaze=new int[r][c];
        for(int i=0; i < r; i++){
            for(int j=0; j < c; j++){
                nmaze[i][j] = R.nextInt( 2 );
            }
        }


        maze.setmaze(nmaze);
        return maze;
    }
}